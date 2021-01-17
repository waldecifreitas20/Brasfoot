package classes.club;

import static classes.MainClass.ADD;
import static classes.MainClass.clubsDataBase;
import static classes.MainClass.updateDataBase;
import static classes.MainClass.updateFreePlayer;
import classes.club.Player.Ability;
import exceptions.InvalidValueException;
import exceptions.ObjectNotFoundException;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;

public class Club extends BaseClub{ 
    //<editor-fold desc="Variaveis">     
    private Color FOREGROUND;
    private ImageIcon BACKGROUND,EMBLEM,EMBLEM_SMALL;     
    private Statistic stats;    
    private double money, costs, power, attackPower, defensePower;    
    private List<Player> substitutes, startingPlayers;   
    
    //</editor-fold>
    
    public Club(String name, List<Player> cast, 
            double money, Color foreground) {
        super(name, cast);         
        this.substitutes = new ArrayList<>();
        this.startingPlayers = new ArrayList<>();
    
        this.stats = new Statistic();        
        this.money = money;
        initCosts();           
        calculateTeamPower(); 
        this.FOREGROUND = foreground;
        try {
            this.EMBLEM = getImage("emblems/" , this.name+" Big",".png"); 
            this.BACKGROUND = getImage("backgrounds/", "background "+this.name, ".png");             
            this.EMBLEM_SMALL = getImage("emblems/", this.name+" Small", ".png"); 
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }  

    //<editor-fold desc=" Métodos internos">
    private ImageIcon getImage(String folder, String fileName, String format) 
            throws FileNotFoundException {
            String url = "/images/"+folder+fileName+format;            
        try {    
            return new ImageIcon(getClass().getResource(url));            
        } catch (Exception ex) {
            ex.printStackTrace();
            String message = "Nao foi possivel encontrar o arquivo no "
                    + "caminho '"+url+"'";;
            throw new FileNotFoundException(message); 
        }   
    }    
       
    private void calculateTeamPower() {
        double power = 0, attack = 0, defense = 0;
        int strikers = 0, defenders = 0;
        
        for (int i = 0; i < getPlayers().size(); i++) {
            power += getPlayers().get(i).getOverall();
            Ability playerSkills = getPlayers().get(i).getSkills();
            String playerPosition = getPlayers().get(i).getPosition();
            
            if (playerPosition.equals("Atacante")) {                
                strikers++;
                attack += (double)(playerSkills.getAttack()*10 + playerSkills.getMidfield()*0.5)/10;
            }
            if (playerPosition.equals("Meio-Campo")) {
                strikers++;
                attack += (double)(playerSkills.getAttack()*0.5 + playerSkills.getMidfield()*10)/10;
            }
            if (playerPosition.equals("Defensor")) {
                defenders++;
                defense += (double)(playerSkills.getDefense()*10 + playerSkills.getMidfield())/10;
            }
            if (playerPosition.equals("Goleiro")) {
                defenders++;                
                defense += playerSkills.getGoalkeep();
            }
          
        }
        this.attackPower = attack/strikers; 
        this.defensePower = defense/defenders;
        this.power = power/this.players.size();
    }
    
    private void initCosts() {
        this.costs = 0;
        for (int i = 0; i < getPlayers().size(); i++) {
            this.costs += this.players.get(i).getSalary();
        }
        this.money -= this.costs;
    }
    
    private boolean isExists(Player player) {
        for (int i = 0; i < this.players.size(); i++) {
            if (this.players.get(i).getName().equals(player.getName())) {
                return true;
            }
        }
        return false;
    }
    
    private boolean responseClub(double offer, double fee, Player player) {       
        boolean firstCondition = fee > 10 && player.getMarketValue()*0.9 < offer;
        boolean secondCondition = fee < 10 && player.getMarketValue()*1.3 < offer;
        boolean thirdCondition = fee < 10 && player.getMarketValue()*1.8 < offer;
        
        return firstCondition || secondCondition || thirdCondition;
    }
    
    private boolean checkBeforeAddStartTeam(Player player) {
    	boolean firstCondition = !this.startingPlayers.contains(player);
    	boolean secondCondition = this.players.contains(player);
    	boolean thirdCondition = this.startingPlayers.size() < 11;
    	
    	return firstCondition && secondCondition && thirdCondition;
    }
        
    private boolean transferIsPossible(double offer, Player player) {
        return this.money > offer && (this.money-offer) > player.getSalary();
    }
   
    private NegotiationResponse analyzerProposalByPlayer(double offer, Player player) {
        
        double fee = this.power - player.getOverall();
        if(responseClub(offer, fee, player)) {
            return new NegotiationResponse("proposta aceita"); 
        }else {
            double counterProposal;        
            if (fee > 10) {
                counterProposal = player.getMarketValue();
            } else {
                counterProposal = player.getMarketValue()*1.3;
            }
            String message = " não aceita menos que " 
                    + ((int)counterProposal+1) 
                    + " Mi \npelo " +player.getName();
            
            return new NegotiationResponse(message);
        }
    }
    //</editor-fold>
    
    //<editor-fold  desc=" Getters ">

    public Color getForeground() {
        return FOREGROUND;
    }

    public ImageIcon getBackground() {
        return BACKGROUND;
    }

    public ImageIcon getEmblemBig() {        
        return EMBLEM;
    }

    public ImageIcon getEmblemSmall() {
        return EMBLEM_SMALL;
    }

    public Statistic getStats() {
        return stats;
    }

    public double getMoney() {
        return money;
    }

    public double getCosts() {
        return costs;
    }

    public double getPower() {
        return power;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getDefensePower() {
        return defensePower;
    }

    public List<Player> getSubstitutes() {
        return substitutes;
    }

    public List<Player> getStartingPlayers() {
        return startingPlayers;
    }

    //</editor-fold>
    
    //Metodos Publicos//    
    public boolean notPlayed(Club rival) {
        return !this.stats.getClubsPlayed().contains(rival);
    }
    
    public void breakContract(Player player) 
            throws ObjectNotFoundException {
        
        for (int i = 0; i < this.players.size(); i++) {
            if(player.equals(this.players.get(i))) {                
                player.receiveContractCancellation();
                this.players.remove(player);                
                try {  
                    updateFreePlayer(player, ADD);
                } catch (InvalidValueException ex) {
                    ex.printStackTrace();
                }
                updateDataBase(this);                 
            }
        }
    }
    
    public NegotiationResponse negotiateWithClub (Club Club, Player player, double offer) {  
        String message;
        if (!this.isExists(player)) {
        	// verifica se o clube aceita vender o jogador
            NegotiationResponse response = Club.analyzerProposalByPlayer(offer, player); 
            if(response.getResponse().equals("proposta aceita") ) { 
                if (player.checkProposal(Club)) { // verifica se o jogador que jogar pelo clube  
                    if (transferIsPossible(offer, player)) { // verifica se o clube tem dinheiro suficiente
                        this.costs += offer;
                        this.money -= offer;
                        player.transferClub(this);                        
                        Club.players.remove(player);                        
                        this.players.add(player);
                        updateDataBase(Club);
                        updateDataBase(this);      
                        message = Club.getName() +
                                " aceitou sua proposta por " +
                                player.getName();
                        return new NegotiationResponse(message);                        
                    } else {
                        message = "Você não tem dinheiro suficiente para essa transferência!";
                       return new NegotiationResponse(message);
                    }
                }else {
                    message = player.getName() + " não quer jogar pelo seu clube!";
                    return new NegotiationResponse(message);
                }                
            } 
            message = "O " + Club.getName() + response.getResponse();
            return new NegotiationResponse(message);
        } else {
            message = "Você já contratou esse jogador!";
            return new NegotiationResponse(message);
        }
        
    }
    
    public Club sellPlayer(Player player) {
        Random generator = new Random(); 
        int index = 0; 
        do {
            int bounds = clubsDataBase().size();
            index = generator.nextInt(bounds); 
        } while (clubsDataBase().get(index) == this);
        
   
        Club Club = clubsDataBase().get(index);  
        Club.players.add(player);
        this.players.remove(player);
        player.transferClub(Club);
        updateDataBase(Club);
        
        Club.money -= player.getMarketValue()*1.3;
        this.money += player.getMarketValue()*1.3;
        
        return Club;
    }
    
    public NegotiationResponse negotiateWithFreePlayer(Player player) 
            throws ObjectNotFoundException {
        
       String message;
        if (!this.isExists(player)) {            
            if (this.money > player.getSalary()) {
                if (player.checkProposal(this)) {
                    player.transferClub(this);
                    this.players.add(player);
                    this.costs += player.getSalary();
                    this.money -= player.getSalary();
                    updateDataBase(this);
                    try {
                        updateFreePlayer(player, ADD);
                    } catch (InvalidValueException ex) {
                        System.err.println(ex.getMessage());
                        ex.printStackTrace();                        
                    }
                    message = player.getName() + " aceitou sua proposta";
                    return new NegotiationResponse(message) ;
                } else {
                    message = player.getName() + " não jogar pelo seu Club";
                    return new NegotiationResponse(message);
                }
            } else {    
                message = "Você não tem dinheiro suficiente para essa transferência!"; 
                return new NegotiationResponse(message);
            }
        } else {
            message = "Você já contratou esse player!";
            return new NegotiationResponse(message); 
        }
    }
    
    public boolean addPlayerToStartTeam(Player player) {
        if (checkBeforeAddStartTeam(player)) {    		
            this.startingPlayers.add(player);
            return true;
        }
        return false;
    }
        
    public boolean removePlayerToStartTeam(Player player) {
        for (int i = 0; i < this.startingPlayers.size(); i++) {
            if (this.startingPlayers.get(i).equals(player)) {
                this.startingPlayers.remove(player);
                return true;
            }
        }
        return false;
    }
       
    public boolean addPlayerToSubstitutesTeam(Player player) {
        if (this.substitutes.size() < 7) {
            this.substitutes.add(player);
            return true;
        }
        return false;
    }
    
    public boolean removePlayerToSubstitutesTeam(Player player) {
        for (int i = 0; i < this.substitutes.size(); i++) {
            if (this.substitutes.get(i).equals(player)) {
                this.substitutes.remove(player);
                return true;
            }
        }
        return false;
    }
           
    public class NegotiationResponse {
        private String response;
        private boolean responseBoolean = true;
        
        public NegotiationResponse(String response) {
            this.response = response;
        } 

        public NegotiationResponse(boolean responseBoolean) {
            this.responseBoolean = responseBoolean;
        }      
            
        public String getResponse() {
            return response;
        }

        private boolean isResponse() {
            return responseBoolean;
        }   
    }
}
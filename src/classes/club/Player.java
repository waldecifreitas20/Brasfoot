package classes.club;

import classes.club.Club;
import exceptions.CannotInstantiedObjectException;


public class Player {
    private final String name; 
    private String status;
    private final String position;
    private double marketValue, overall, salary;
    private Ability skills;
    private int age;
   
    public Player(String name, String position, Ability skills, int age, String status) {  
        
        this.position = position;  
        this.name = name;        
        this.skills = skills;        
        this.status = status;
        
        if(age < 16 || age > 42) {
            try {
                throw new CannotInstantiedObjectException("Jogador com idade inválida");
            } catch(CannotInstantiedObjectException ex) {
                ex.printStackTrace();
                this.age = 24; 
            }
        }else {
            this.age = age;
        }                     
        initPlayer(this.position);
        this.salary = ((this.overall - 39) + (43 - this.age) + (this.marketValue/12))/5;
    }

    public Player() {
        this.name = null;      
        this.salary = 0;             
        this.status = null;
        this.overall = 0;
        this.position = null;
    }
    
    private void initPlayer(String position) {
       
        switch(position.toLowerCase()) {
            case "goleiro" :
                this.overall = (skills.GOALKEEP*10 + skills.DEFENSE*0.5)/10;                
            break;
            case "defensor" :
                this.overall = (skills.DEFENSE*10 + skills.MIDFIELD)/10.5;               
            break;
            case "meio-campo" :
                this.overall = (skills.DEFENSE*2 + skills.MIDFIELD*10 + skills.ATTACK*2)/13;                
            break;
            case "atacante" :
                this.overall = (skills.MIDFIELD*2.1 + skills.ATTACK*10)/12;            
            break;
        }
        this.marketValue = (this.overall - 39) * (42.1 - this.age)/8;        
    }
    
    //Metodos publicos//
    public boolean checkProposal(Club club) {        
        if (club.getPower() < this.overall * 0.87) {
            return false;
        }else {
            this.status = club.getName(); 
            this.salary = ((this.overall - 39) + (43 - this.age) + (this.marketValue/12))/5;
            return true;            
        }
    }
    
    public void transferClub(Club club) {
        this.status = club.getName();
       
    }
    
    public void receiveContractCancellation() {
        this.status = "Sem Clube";       
        this.salary = 0;
    }
    
    //Getters//
    //<editor-fold desc=" Getters ">
    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getPosition() {
        return position;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public double getOverall() {
        return overall;
    }

    public Ability getSkills() {
        return skills;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }    
    //</editor-fold> 

    public static class Position {
        public static String FORWARD = "Atacante";
        public static String MIDFIELDER = "Meio-Campo";
        public static String DEFENDER = "Defensor";
        public static String GOALKEEPER = "Goleiro";
                
    }
    
    public static class Ability {
        private int ATTACK;
        private int MIDFIELD;
        private int DEFENSE;
        private int GOALKEEP;

        public Ability(int ATTACK, int MIDFIELD, int DEFENSE, int GOALKEEP) {
            this.ATTACK = ATTACK;
            this.MIDFIELD = MIDFIELD;
            this.DEFENSE = DEFENSE;
            this.GOALKEEP = GOALKEEP;
        }

        public int getAttack() {
            return ATTACK;
        }

        public int getMidfield() {
            return MIDFIELD;
        }

        public int getDefense() {
            return DEFENSE;
        }

        public int getGoalkeep() {
            return GOALKEEP;
        }

    }
}
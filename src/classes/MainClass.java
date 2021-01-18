package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import classes.club.Club;
import classes.club.FreePlayer;
import classes.club.Player;
import classes.club.Player.Ability;
import classes.club.Player.Position;
import exceptions.InvalidValueException;
import exceptions.ObjectNotFoundException;
import java.io.IOException;
import views.StartScreen;

public class MainClass{   
    
    private static List<Club> allClubs = initClubs();   
    private static List<Player> allPlayers = initPlayers();    
    private static FreePlayer freePlayers = new FreePlayer();
    public static int ADD = 1;
    public static int REMOVE = 0;
    
    public static void main(String[] args) throws IOException {  
        //new StartScreen().setVisible(true);
        System.out.println(allPlayers.size());
      /*  List<String> matchs = new ArrayList<>();
        do {
            String game = sc.drawRound();
            if (!game.equals("")) {
                matchs.add(game);
            }
        } while (matchs.size() < 30);
        
        File root = new File("");
        String relativePath = "/src/classes/rounds.txt";
        Path dir = Paths.get(root.getAbsolutePath()+relativePath);
        String times[] = new String[2];
        String game = null;
        try {
            List<String> readAllLines = Files.readAllLines(dir);
            int index = 0;
            while(index < readAllLines.size()) {
                if (readAllLines.get(index).contains("Bayern")) {
                    game = (readAllLines.get(index).toUpperCase());                   
                    break;
                }
                index++;
            }
            times = game.split("&");
            System.out.println(times[0]+ " x "+ times[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
 */
     
    }
    public static List<Club> clubsDataBase() {
        return allClubs;
    }
        
    public static void updateFreePlayer(Player freePlayer, int action) 
            throws ObjectNotFoundException, InvalidValueException {
        
        if (freePlayer == null) {
            String message = "Variavel 'freePlayer' == null "+freePlayer;
            throw new ObjectNotFoundException(message);
        } else{
            switch(action) {
                case 0 : 
                    freePlayers.removePlayer(freePlayer);                   
                    break;
                case 1 : 
                    freePlayers.addPlayer(freePlayer);
                    break;
                default : 
                    String message = "Valor da variavel 'action' invalido!";
                    throw new InvalidValueException(message);                   
            }
        }
    }
    
    public static void updateDataBase(Club club) {
        int index = 0;
        for (int i = 0; i < clubsDataBase().size(); i++) {
            String clubName = clubsDataBase().get(i).getName();
            if (club.getName().equals(clubName)) {                
                index = i;
            }
        }
        clubsDataBase().set(index, club);
    }
    
    public static List<Player> playersDataBase() {     
        return allPlayers;
    }
     
    public static Player getPlayer(String playerName) throws ObjectNotFoundException {
        for (int i = 0; i < playersDataBase().size(); i++) {
            if (playerName.equals(playersDataBase().get(i).getName())) {
                return playersDataBase().get(i); 
            }
        }
        throw new ObjectNotFoundException(playerName);
    }
    
    public static Club getClub(String clubName) throws ObjectNotFoundException {
        for (int i = 0; i < clubsDataBase().size(); i++) {
            if (clubsDataBase().get(i).getName().equals(clubName)) {
                return clubsDataBase().get(i);
            }
        }
        throw new ObjectNotFoundException(clubName);
    }
    
    //<editor-fold desc=" Métodos de inicialização ">
    private static List<Club> initClubs() {
        final Club clubs[] = new Club[6];         
        clubs[0] = barcelona();
        clubs[1] = realMadrid();       
        clubs[2] = bayern();      
        clubs[3] = dortmund();             
        clubs[4] = psg();             
        clubs[5] = juve();             
        List<Club> everyClub = new ArrayList();
        for (Club single : clubs) {
            everyClub.add(single);
        }
        return everyClub;
    }
    
    private static List<Player> initPlayers() {
        List<Player> todosplayers = new ArrayList();
        for (int i = 0; i < allClubs.size(); i++) {            
            for (int j = 0; j < allClubs.get(i).getPlayers().size(); j++) {
              todosplayers.add(allClubs.get(i).getPlayers().get(j)); 
            }            
        } 
        return todosplayers;
    }
        
    private static Club barcelona() {
        Player[] castBarca = new Player[20];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);       
        castBarca[0] = new Player("Ter Stegen", Position.GOALKEEPER, new Ability(5, 8, 40, 86), 28, "FC Barcelona");
        castBarca[1] = new Player("Neto", Position.GOALKEEPER, new Ability(14, 16, 50, 83), 31, "FC Barcelona");  
        castBarca[2] = new Player("Piqué", Position.DEFENDER, new Ability(58, 62, 84, 40), 33, "FC Barcelona");        
        castBarca[3] = new Player("Lenglet", Position.DEFENDER, new Ability(54, 62, 80, 10), 25, "FC Barcelona");
        castBarca[4] = new Player("Jordi Alba", Position.DEFENDER, new Ability(76, 71, 81, 5), 31, "FC Barcelona");
        castBarca[5] = new Player("Araújo", Position.DEFENDER, new Ability(63, 61, 73, 5), 21, "FC Barcelona");
        castBarca[6] = new Player("Dest", Position.DEFENDER, new Ability(65, 62, 75, 10), 20, "FC Barcelona");
        castBarca[7] = new Player("Umtiti", Position.DEFENDER, new Ability(44, 56, 84, 5), 27, "FC Barcelona");
        castBarca[8] = new Player("Sergio Busquets",Position.MIDFIELDER, new Ability(68, 84, 72, 8), 32, "FC Barcelona");
        castBarca[9] = new Player("Pjanic", Position.MIDFIELDER, new Ability(68, 83, 71, 9), 30, "FC Barcelona");
        castBarca[10] = new Player("Puing", Position.MIDFIELDER, new Ability(70, 75, 40, 5), 21, "FC Barcelona");
        castBarca[11] = new Player("P. Coutinho", Position.MIDFIELDER, new Ability(84, 86, 40, 5), 28, "FC Barcelona");
        castBarca[12] = new Player("F. de Jong", Position.MIDFIELDER, new Ability(65, 82, 76, 10), 23, "FC Barcelona");
        castBarca[13] = new Player("A. Griezmann", Position.FORWARD, new Ability(84, 78, 60, 4), 29, "FC Barcelona");
        castBarca[14] = new Player("Braithwaite", Position.FORWARD, new Ability(78, 68, 50, 5), 29, "FC Barcelona");
        castBarca[15] = new Player("L. Messi", Position.FORWARD, new Ability(94, 88, 57, 2), 33, "FC Barcelona");
        castBarca[16] = new Player("Pedri", Position.FORWARD, new Ability(76, 71, 40, 5), 18, "FC Barcelona");
        castBarca[17] = new Player("A. Fati", Position.FORWARD, new Ability(79, 72, 40, 5), 18, "FC Barcelona");
        castBarca[18] = new Player("Dembélé", Position.FORWARD, new Ability(81, 76, 40, 5), 23, "FC Barcelona");
        castBarca[19] = new Player("Trincão", Position.FORWARD, new Ability(74, 76, 40, 5), 21, "FC Barcelona");
        
        List<Player> cast = new ArrayList();
        for (Player player : castBarca) {
            cast.add(player);
        }
        return new Club("FC Barcelona", cast, 800, Color.yellow);
    }
    
    private static Club realMadrid() {
        Player[] castRMD = new Player[24];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        castRMD[0] = new Player("Thibaut Courtois",Position.GOALKEEPER, new Ability(5, 8, 40, 87), 28, "Real Madrid CF");
        castRMD[1] = new Player("Andriy Lunin", Position.GOALKEEPER, new Ability(5, 8, 40, 74), 21, "Real Madrid CF");
        castRMD[2] = new Player("Sergio Ramos", Position.DEFENDER, new Ability(70, 62, 87, 40), 34, "Real Madrid CF");
        castRMD[3] = new Player("Raphael Varane", Position.DEFENDER, new Ability(54, 62, 83, 10), 27, "Real Madrid CF");
        castRMD[4] = new Player("Nacho Fernandéz", Position.DEFENDER, new Ability(54, 62, 82, 10), 30, "Real Madrid CF");
        castRMD[5] = new Player("E. Militão", Position.DEFENDER, new Ability(54, 62, 79, 10), 22, "Real Madrid CF");
        castRMD[6] = new Player("Marcelo", Position.DEFENDER, new Ability(77, 71, 83, 5), 32, "Real Madrid CF");
        castRMD[7] = new Player("Mendy", Position.DEFENDER, new Ability(77, 71, 84, 5), 25, "Real Madrid CF");
        castRMD[8] = new Player("Carvajal", Position.DEFENDER, new Ability(74, 62, 84, 10), 28, "Real Madrid CF");
        castRMD[9] = new Player("Odriozola", Position.DEFENDER, new Ability(64, 62, 78, 10), 25, "Real Madrid CF");
        castRMD[10] = new Player("T. Kroos",Position.MIDFIELDER, new Ability(69, 85, 77, 8), 30, "Real Madrid CF");
        castRMD[11] = new Player("Isco",Position.MIDFIELDER, new Ability(78, 85, 67, 8), 28, "Real Madrid CF");
        castRMD[12] = new Player("L. Modric", Position.MIDFIELDER, new Ability(68, 84, 75, 9), 35, "Real Madrid CF");
        castRMD[13] = new Player("F. Valverde", Position.MIDFIELDER, new Ability(69, 83, 78, 9), 22, "Real Madrid CF");
        castRMD[14] = new Player("Marco Asensio", Position.MIDFIELDER, new Ability(81, 84, 65, 9), 24, "Real Madrid CF");
        castRMD[15] = new Player("Casemiro", Position.MIDFIELDER, new Ability(65, 88, 80, 10), 28, "Real Madrid CF");
        castRMD[16] = new Player("E. Hazard", Position.FORWARD, new Ability(86, 82, 40, 4), 29, "Real Madrid CF");
        castRMD[17] = new Player("Benzema", Position.FORWARD, new Ability(86, 87, 57, 2), 32, "Real Madrid CF");
        castRMD[18] = new Player("Odegaard",Position.FORWARD, new Ability(76, 75, 67, 8), 22, "Real Madrid CF");
        castRMD[19] = new Player("Lucas Vázquez",Position.FORWARD, new Ability(76, 75, 77, 8), 29, "Real Madrid CF");
        castRMD[20] = new Player("L. Jovic", Position.FORWARD, new Ability(80, 65, 57, 2), 23, "Real Madrid CF");
        castRMD[21] = new Player("Mariano Díaz", Position.FORWARD, new Ability(78, 55, 57, 2), 27, "Real Madrid CF");
        castRMD[22] = new Player("Rodrygo", Position.FORWARD, new Ability(76, 69, 40, 5), 19, "Real Madrid CF");
        castRMD[23] = new Player("Vinicius Júnior", Position.FORWARD, new Ability(75, 68, 40, 5), 20, "Real Madrid CF");
        List<Player> cast = new ArrayList();
       
        for (Player player : castRMD) {
            cast.add(player);
        }
        return new Club("Real Madrid CF", cast, 800, Color.black);
    }
    
    private static Club bayern() {
        Player[] castBayern = new Player[23];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        castBayern[0]  = new Player("Manuel Neuer",Position.GOALKEEPER, new Ability(5, 8, 40, 90), 34, "Bayern de Munique");
        castBayern[1]  = new Player("Nübel",Position.GOALKEEPER, new Ability(5, 8, 40, 83), 25, "Bayern de Munique");
        castBayern[2]  = new Player("A. Davies",Position.DEFENDER, new Ability(68, 72, 85, 15), 20, "Bayern de Munique");
        castBayern[3]  = new Player("Lucas Hernández",Position.DEFENDER, new Ability(70, 72, 80, 15), 24, "Bayern de Munique");
        castBayern[4]  = new Player("Kimmich",Position.DEFENDER, new Ability(59, 78, 87, 17), 25, "Bayern de Munique");
        castBayern[5]  = new Player("Sarr",Position.DEFENDER, new Ability(40, 52, 82, 20), 28, "Bayern de Munique");
        castBayern[6]  = new Player("Süle",Position.DEFENDER, new Ability(40, 42, 84, 10), 25, "Bayern de Munique");
        castBayern[7]  = new Player("Pavard",Position.DEFENDER, new Ability(60, 62, 83, 10), 24, "Bayern de Munique");
        castBayern[8]  = new Player("Richards",Position.DEFENDER, new Ability(40, 42, 76, 20), 20, "Bayern de Munique");
        castBayern[9]  = new Player("J. Boateng",Position.DEFENDER, new Ability(40, 52, 85, 20), 32, "Bayern de Munique");
        castBayern[10] = new Player("Alaba",Position.DEFENDER, new Ability(70, 80, 83, 10), 28, "Bayern de Munique");
        castBayern[11] = new Player("Goretzka",Position.MIDFIELDER, new Ability(58, 83, 62, 1), 25, "Bayern de Munique");
        castBayern[12] = new Player("Javi Martínez",Position.MIDFIELDER, new Ability(58, 82, 60, 15), 32, "Bayern de Munique");
        castBayern[13] = new Player("Tolisso",Position.MIDFIELDER, new Ability(72, 84, 70, 7), 26, "Bayern de Munique");
        castBayern[14] = new Player("T. Müller",Position.MIDFIELDER, new Ability(87, 86, 60, 7), 31, "Bayern de Munique");
        castBayern[15] = new Player("Douglas Costa",Position.MIDFIELDER, new Ability(82, 85, 60, 7), 30, "Bayern de Munique");
        castBayern[16] = new Player("R. Lewandowski",Position.FORWARD, new Ability(93, 80, 40, 27), 32, "Bayern de Munique");
        castBayern[17] = new Player("L. Sané",Position.FORWARD, new Ability(85, 82, 30, 17), 24, "Bayern de Munique");
        castBayern[18] = new Player("Arp",Position.FORWARD, new Ability(80, 72, 30, 17), 20, "Bayern de Munique");
        castBayern[19] = new Player("Tillman",Position.FORWARD, new Ability(75, 72, 30, 17), 18, "Bayern de Munique");
        castBayern[20] = new Player("S. Gnabry",Position.FORWARD, new Ability(87, 85, 48, 27), 25, "Bayern de Munique");
        castBayern[21] = new Player("Choupo-Moting",Position.FORWARD, new Ability(83, 65, 48, 27), 31, "Bayern de Munique");
        castBayern[22] = new Player("K. Coman",Position.FORWARD, new Ability(85, 84, 48, 20), 24, "Bayern de Munique");
               
        List<Player> cast = new ArrayList();
        for (Player player : castBayern) {
            cast.add(player);
        }
        return new Club("Bayern de Munique", cast, 800, Color.white);
    }
    
    private static Club dortmund() {
        Player[] castBVB = new Player[21];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        castBVB[0] = new Player("Burki",Position.GOALKEEPER, new Ability(5, 8, 40, 83), 30, "Borussia Dortmund");
        castBVB[1] = new Player("Hitz",Position.GOALKEEPER, new Ability(5, 8, 40, 80), 33, "Borussia Dortmund");
        castBVB[2] = new Player("Schmelzer",Position.DEFENDER, new Ability(68, 72, 77, 15), 32, "Borussia Dortmund");
        castBVB[3] = new Player("Piszczek",Position.DEFENDER, new Ability(68, 72, 77, 15), 35, "Borussia Dortmund");
        castBVB[4] = new Player("R. Guerreiro",Position.DEFENDER, new Ability(69, 74, 82, 17), 27, "Borussia Dortmund");
        castBVB[5] = new Player("Passlack",Position.DEFENDER, new Ability(66, 70, 78, 17), 22, "Borussia Dortmund");
        castBVB[6] = new Player("Schulz",Position.DEFENDER, new Ability(66, 61, 79, 17), 27, "Borussia Dortmund");
        castBVB[7] = new Player("Zagadou",Position.DEFENDER, new Ability(40, 52, 78, 20), 21, "Borussia Dortmund");
        castBVB[8] = new Player("Akanji",Position.DEFENDER, new Ability(58, 65, 79, 30), 25, "Borussia Dortmund");
        castBVB[9] = new Player("E. Can",Position.MIDFIELDER, new Ability(58, 81, 79, 1), 26, "Borussia Dortmund");
        castBVB[10] = new Player("Witsel",Position.MIDFIELDER, new Ability(58, 83, 82, 1), 31, "Borussia Dortmund");
        castBVB[11] = new Player("Dahoud",Position.MIDFIELDER, new Ability(58, 81, 78, 1), 25, "Borussia Dortmund");
        castBVB[12] = new Player("T. Hazard",Position.MIDFIELDER, new Ability(75, 80, 60, 15), 27, "Borussia Dortmund");
        castBVB[13] = new Player("T. Meunier",Position.MIDFIELDER, new Ability(75, 83, 70, 15), 29, "Borussia Dortmund");
        castBVB[14] = new Player("Delaney",Position.MIDFIELDER, new Ability(74, 83, 60, 15), 29, "Borussia Dortmund");
        castBVB[15] = new Player("Reinier",Position.MIDFIELDER, new Ability(65, 72, 60, 15), 18, "Borussia Dortmund");
        castBVB[16] = new Player("Reus",Position.MIDFIELDER, new Ability(85, 87, 60, 7), 31, "Borussia Dortmund");
        castBVB[17] = new Player("J. Brandt",Position.FORWARD, new Ability(83, 80, 40, 27), 24, "Borussia Dortmund");
        castBVB[18] = new Player("Moukoko",Position.FORWARD, new Ability(75, 72, 40, 27), 16, "Borussia Dortmund");
        castBVB[19] = new Player("Sancho",Position.FORWARD, new Ability(83, 80, 30, 17), 20,"Borussia Dortmund");
        castBVB[20] = new Player("Haland",Position.FORWARD, new Ability(84, 78, 48, 27), 20, "Borussia Dortmund");
               
        List<Player> cast = new ArrayList();
        for (Player player : castBVB) {
            cast.add(player);
        }
        return new Club("Borussia Dortmund", cast, 800, Color.BLACK); 
    }
    
    private static Club psg() {
        Player[] castPSG = new Player[22];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        
        castPSG[0] = new Player("K. Navas",Position.GOALKEEPER, new Ability(5,8,40,86), 34, "Paris Saint-Germain");
        castPSG[1] = new Player("Sergio Rico",Position.GOALKEEPER,new Ability(5, 8, 40, 83), 27, "Paris Saint-Germain");
        castPSG[2] = new Player("Diallo",Position.DEFENDER, new Ability(5, 40, 80, 32), 24, "Paris Saint-Germain");
        castPSG[3] = new Player("J. Bernat",Position.DEFENDER, new Ability(50, 70, 80, 32), 27, "Paris Saint-Germain");
        castPSG[4] = new Player("Marquinhos",Position.DEFENDER, new  Ability(50, 81, 84, 32), 26, "Paris Saint-Germain");
        castPSG[5] = new Player("Kimpembé",Position.DEFENDER, new Ability(50, 78, 82, 32), 25, "Paris Saint-Germain");
        castPSG[6] = new Player("T. Kehrer",Position.DEFENDER, new Ability(50, 76, 82, 32), 24, "Paris Saint-Germain");
        castPSG[7] = new Player("L. Kurzawa",Position.DEFENDER, new Ability(50, 72, 81, 32), 28, "Paris Saint-Germain");
        castPSG[8] = new Player("Florenzi",Position.DEFENDER, new Ability(50, 72, 77, 32), 29, "Paris Saint-Germain");
        castPSG[9] = new Player("Dagba",Position.DEFENDER, new Ability(50, 62, 78, 32), 22, "Paris Saint-Germain");
        castPSG[10] = new Player("Danilo P.",Position.MIDFIELDER, new Ability(50, 77, 75, 12), 29, "Paris Saint-Germain");
        castPSG[11] = new Player("I. Gueyé",Position.MIDFIELDER, new Ability(65, 79, 75, 12), 31, "Paris Saint-Germain");
        castPSG[12] = new Player("M. Verratti",Position.MIDFIELDER, new Ability(69, 84, 75, 12), 28, "Paris Saint-Germain");
        castPSG[13] = new Player("Ander Herrera",Position.MIDFIELDER, new Ability(70, 83, 72, 12), 31, "Paris Saint-Germain");
        castPSG[14] = new Player("Rafinha",Position.MIDFIELDER, new Ability(75, 83, 72, 12), 27, "Paris Saint-Germain");
        castPSG[15] = new Player("J. Draxler",Position.MIDFIELDER, new Ability(79, 77, 52, 12), 27, "Paris Saint-Germain");
        castPSG[16] = new Player("Neymar",Position.FORWARD, new Ability(90, 86, 52, 12), 28, "Paris Saint-Germain");
        castPSG[17] = new Player("Di María",Position.FORWARD, new Ability(86, 85, 52, 12), 32, "Paris Saint-Germain");
        castPSG[18] = new Player("P. Sarabia",Position.FORWARD, new Ability(83, 80, 62, 2), 28, "Paris Saint-Germain");
        castPSG[19] = new Player("K. Mbappé",Position.FORWARD, new Ability(87, 81, 58, 2), 22, "Paris Saint-Germain");
        castPSG[20] = new Player("M. Icardi",Position.FORWARD, new Ability(87, 71, 52, 2), 27, "Paris Saint-Germain");
        castPSG[21] = new Player("Moise Kean","Atacante", new Ability(84, 72, 42, 21), 20, "Paris Saint-Germain");
       
        List<Player> cast = new ArrayList();
        for (Player player : castPSG) {
            cast.add(player);
        }
        return new Club("Paris Saint-Germain", cast, 800, Color.white);
    }
        
    private static Club juve() {
        Player[] castJuve = new Player[1];
        //new Player("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        castJuve[0] = new Player("Szczesny","Goleiro", new Ability(5, 8, 40, 85), 30, "Juventus FC");
       
        List<Player> cast = new ArrayList();
        for (Player player : castJuve) {
            cast.add(player);
        }
        return new Club("Juventus FC", cast, 800, Color.white);
    }
    
//</editor-fold>
}

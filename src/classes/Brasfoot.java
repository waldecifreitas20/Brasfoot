package classes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import views.TelaInicial;

public class Brasfoot{   
    
    private static ArrayList<Clube> allClubs = initClubes();  
    private static ArrayList<Jogador> allPlayers = initJogadores();
    
    public static void main(String[] args) {          
        new TelaInicial().setVisible(true);  
    }      
    
    public static ArrayList<Clube> baseDadosClubes() {
        return allClubs;
    }
    
    public static void updateBaseDados(Clube clube) {
        int index = 0;
        for (int i = 0; i < baseDadosClubes().size(); i++) {
            if (clube.getNome().equals(baseDadosClubes().get(i).getNome())) {                
                index = i;
            }
        }
        baseDadosClubes().set(index, clube);
    }
    
    public static ArrayList<Jogador> baseDadosJogadores() {     
        return allPlayers;
    }
     
    public static Jogador getJogador(String nomeJogador) {
        for (int i = 0; i < baseDadosJogadores().size(); i++) {
            if (nomeJogador.equals(baseDadosJogadores().get(i).getNome())) {
                return baseDadosJogadores().get(i);
            }
        }
        return null;
    }
    public static Clube getClube(String nomeClube) {
        for (int i = 0; i < baseDadosClubes().size(); i++) {
            if (baseDadosClubes().get(i).getNome().equals(nomeClube)) {
                return baseDadosClubes().get(i);
            }
        }
        return null;
    }
    
    //<editor-fold desc=" Métodos de inicialização ">
    private static ArrayList<Clube> initClubes() {
        final Clube clubes[] = new Clube[6];         
        clubes[0] = barcelona();
        clubes[1] = realMadrid();       
        clubes[2] = bayern();      
        clubes[3] = dortmund();             
        clubes[4] = psg();             
        clubes[5] = juve();             
        ArrayList<Clube> todosClubes = new ArrayList();
        for (int i = 0; i < clubes.length; i++) {
            todosClubes.add(clubes[i]);
        }
        return todosClubes;
    }
    
    private static ArrayList<Jogador> initJogadores() {
        ArrayList<Jogador> todosJogadores = new ArrayList();
        for (int i = 0; i < allClubs.size(); i++) {            
            for (int j = 0; j < allClubs.get(i).getElenco().size(); j++) {
              todosJogadores.add(allClubs.get(i).getElenco().get(j));
            }            
        } 
        return todosJogadores;
    }
        
    private static Clube barcelona() {
        Jogador[] elencoBarca = new Jogador[20];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBarca[0] = new Jogador("Ter Stegen","Goleiro", 5, 8, 40, 86, 28, "FC Barcelona");
        elencoBarca[1] = new Jogador("Neto", "Goleiro", 14, 16, 50, 83, 31, "FC Barcelona");
        elencoBarca[2] = new Jogador("Piqué", "Defensor", 58, 62, 84, 40, 33, "FC Barcelona");        
        elencoBarca[3] = new Jogador("Lenglet", "Defensor", 54, 62, 80, 10, 25, "FC Barcelona");
        elencoBarca[4] = new Jogador("Jordi Alba", "Defensor", 76, 71, 81, 5, 31, "FC Barcelona");
        elencoBarca[5] = new Jogador("Araújo", "Defensor", 63, 61, 73, 5, 21, "FC Barcelona");
        elencoBarca[6] = new Jogador("Dest", "Defensor",65, 62, 75, 10, 20, "FC Barcelona");
        elencoBarca[7] = new Jogador("Umtiti", "Defensor", 44, 56, 84, 5, 27, "FC Barcelona");
        elencoBarca[8] = new Jogador("Sergio Busquets","Meio-Campo", 68, 84, 72, 8, 32, "FC Barcelona");
        elencoBarca[9] = new Jogador("Pjanic", "Meio-Campo", 68, 83, 71, 9, 30, "FC Barcelona");
        elencoBarca[10] = new Jogador("Puing", "Meio-Campo", 70, 75, 40, 5, 21, "FC Barcelona");
        elencoBarca[11] = new Jogador("P. Coutinho", "Meio-Campo", 84, 86, 40, 5, 28, "FC Barcelona");
        elencoBarca[12] = new Jogador("F. de Jong", "Meio-Campo", 65, 82, 76, 10, 23, "FC Barcelona");
        elencoBarca[13] = new Jogador("A. Griezmann", "Atacante", 84, 78, 60, 4, 29, "FC Barcelona");
        elencoBarca[14] = new Jogador("Braithwaite", "Atacante", 78, 68, 50, 5, 29, "FC Barcelona");
        elencoBarca[15] = new Jogador("L. Messi", "Atacante", 94, 88, 57, 2, 33, "FC Barcelona");
        elencoBarca[16] = new Jogador("Pedri", "Atacante", 76, 71, 40, 5, 18, "FC Barcelona");
        elencoBarca[17] = new Jogador("A. Fati", "Atacante", 79, 72, 40, 5, 18, "FC Barcelona");
        elencoBarca[18] = new Jogador("Dembélé", "Atacante", 81, 76, 40, 5, 23, "FC Barcelona");
        elencoBarca[19] = new Jogador("Trincão", "Atacante", 74, 76, 40, 5, 21, "FC Barcelona");
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoBarca.length; i++) {
            elenco.add(elencoBarca[i]);
        }
        return new Clube("FC Barcelona", elenco, (short)5, 800, "barcelona.png", 
                "barcelona_mini.png", "background_barcelona.png", Color.yellow, 0);
    }
    
    private static Clube realMadrid() {
        Jogador[] elencoRMD = new Jogador[24];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoRMD[0] = new Jogador("Thibaut Courtois","Goleiro", 5, 8, 40, 87, 28, "Real Madrid CF");
        elencoRMD[1] = new Jogador("Andriy Lunin","Goleiro", 5, 8, 40, 74, 21, "Real Madrid CF");
        elencoRMD[2] = new Jogador("Sergio Ramos", "Defensor", 70, 62, 87, 40, 34, "Real Madrid CF");
        elencoRMD[3] = new Jogador("Raphael Varane", "Defensor", 54, 62, 83, 10, 27, "Real Madrid CF");
        elencoRMD[4] = new Jogador("Nacho Fernandéz", "Defensor", 54, 62, 82, 10, 30, "Real Madrid CF");
        elencoRMD[5] = new Jogador("E. Militão", "Defensor", 54, 62, 79, 10, 22, "Real Madrid CF");
        elencoRMD[6] = new Jogador("Marcelo", "Defensor", 77, 71, 83, 5, 32, "Real Madrid CF");
        elencoRMD[7] = new Jogador("Mendy", "Defensor", 77, 71, 84, 5, 25, "Real Madrid CF");
        elencoRMD[8] = new Jogador("Carvajal", "Defensor",74, 62, 84, 10, 28, "Real Madrid CF");
        elencoRMD[9] = new Jogador("Odriozola", "Defensor",64, 62, 78, 10, 25, "Real Madrid CF");
        elencoRMD[10] = new Jogador("T. Kroos","Meio-Campo", 69, 85, 77, 8, 30, "Real Madrid CF");
        elencoRMD[11] = new Jogador("Isco","Meio-Campo", 78, 85, 67, 8, 28, "Real Madrid CF");
        elencoRMD[12] = new Jogador("L. Modric", "Meio-Campo", 68, 84, 75, 9, 35, "Real Madrid CF");
        elencoRMD[13] = new Jogador("F. Valverde", "Meio-Campo", 69, 83, 78, 9, 22, "Real Madrid CF");
        elencoRMD[14] = new Jogador("Marco Asensio", "Meio-Campo", 81, 84, 65, 9, 24, "Real Madrid CF");
        elencoRMD[15] = new Jogador("Casemiro", "Meio-Campo", 65, 88, 80, 10, 28, "Real Madrid CF");
        elencoRMD[16] = new Jogador("E. Hazard", "Atacante", 86, 82, 40, 4, 29, "Real Madrid CF");
        elencoRMD[17] = new Jogador("Benzema", "Atacante", 86, 87, 57, 2, 32, "Real Madrid CF");
        elencoRMD[18] = new Jogador("Odegaard","Atacante", 76, 75, 67, 8, 22, "Real Madrid CF");
        elencoRMD[19] = new Jogador("Lucas Vázquez","Atacante", 76, 75, 77, 8, 29, "Real Madrid CF");
        elencoRMD[20] = new Jogador("L. Jovic", "Atacante", 80, 65, 57, 2, 23, "Real Madrid CF");
        elencoRMD[21] = new Jogador("Mariano Díaz", "Atacante", 78, 55, 57, 2, 27, "Real Madrid CF");
        elencoRMD[22] = new Jogador("Rodrygo", "Atacante", 76, 69, 40, 5, 19, "Real Madrid CF");
        elencoRMD[23] = new Jogador("Vinicius Júnior", "Atacante", 75, 68, 40, 5, 20, "Real Madrid CF");
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoRMD.length; i++) {
            elenco.add(elencoRMD[i]);
        }
        return new Clube("Real Madrid CF", elenco, (short)5, 800, "realmadrid.png", 
                "realmadrid_mini.png", "background_real.png", Color.black, 1);
    }
    
    private static Clube bayern() {
        Jogador[] elencoBayern = new Jogador[23];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBayern[0]  = new Jogador("Manuel Neuer","Goleiro", 5, 8, 40, 90, 34, "Bayern de Munique");
        elencoBayern[1]  = new Jogador("Nübel","Goleiro", 5, 8, 40, 83, 25, "Bayern de Munique");
        elencoBayern[2]  = new Jogador("A. Davies","Defensor", 68, 72, 85, 15, 20, "Bayern de Munique");
        elencoBayern[3]  = new Jogador("Lucas Hernández","Defensor", 70, 72, 80, 15, 24, "Bayern de Munique");
        elencoBayern[4]  = new Jogador("Kimmich","Defensor", 59, 78, 87, 17, 25, "Bayern de Munique");
        elencoBayern[5]  = new Jogador("Sarr","Defensor", 40, 52, 82, 20, 28, "Bayern de Munique");
        elencoBayern[6]  = new Jogador("Süle","Defensor", 40, 42, 84, 10, 25, "Bayern de Munique");
        elencoBayern[7]  = new Jogador("Pavard","Defensor", 60, 62, 83, 10, 24, "Bayern de Munique");
        elencoBayern[8]  = new Jogador("Richards","Defensor", 40, 42, 76, 20, 20, "Bayern de Munique");
        elencoBayern[9]  = new Jogador("J. Boateng","Defensor", 40, 52, 85, 20, 32, "Bayern de Munique");
        elencoBayern[10] = new Jogador("Alaba","Defensor", 70, 80, 83, 10, 28, "Bayern de Munique");
        elencoBayern[11] = new Jogador("Goretzka","Meio-Campo", 58, 83, 62, 1, 25, "Bayern de Munique");
        elencoBayern[12] = new Jogador("Javi Martínez","Meio-Campo", 58, 82, 60, 15, 32, "Bayern de Munique");
        elencoBayern[13] = new Jogador("Tolisso","Meio-Campo", 72, 84, 70, 7, 26, "Bayern de Munique");
        elencoBayern[14] = new Jogador("T. Müller","Meio-Campo", 87, 86, 60, 7, 31, "Bayern de Munique");
        elencoBayern[15] = new Jogador("Douglas Costa","Meio-Campo", 82, 85, 60, 7, 30, "Bayern de Munique");
        elencoBayern[16] = new Jogador("R. Lewandowski","Atacante", 93, 80, 40, 27, 32, "Bayern de Munique");
        elencoBayern[17] = new Jogador("L. Sané","Atacante", 85, 82, 30, 17, 24, "Bayern de Munique");
        elencoBayern[18] = new Jogador("Arp","Atacante", 80, 72, 30, 17, 20, "Bayern de Munique");
        elencoBayern[19] = new Jogador("Tillman","Atacante", 75, 72, 30, 17, 18, "Bayern de Munique");
        elencoBayern[20] = new Jogador("S. Gnabry","Atacante", 87, 85, 48, 27, 25, "Bayern de Munique");
        elencoBayern[21] = new Jogador("Choupo-Moting","Atacante", 83, 65, 48, 27, 31, "Bayern de Munique");
        elencoBayern[22] = new Jogador("K. Coman","Atacante", 85, 84, 48, 20, 24, "Bayern de Munique");
               
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoBayern.length; i++) {
            elenco.add(elencoBayern[i]);
        }
        return new Clube("Bayern de Munique", elenco, (short)5, 800, "bayern.png", 
                "bayern_mini.png", "background_bayern.png", Color.white, 2);
    }
    
    private static Clube dortmund() {
        Jogador[] elencoBVB = new Jogador[21];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBVB[0] = new Jogador("Burki","Goleiro", 5, 8, 40, 83, 30, "Borussia Dortmund");
        elencoBVB[1] = new Jogador("Hitz","Goleiro", 5, 8, 40, 80, 33, "Borussia Dortmund");
        elencoBVB[2] = new Jogador("Schmelzer","Defensor", 68, 72, 77, 15, 32, "Borussia Dortmund");
        elencoBVB[3] = new Jogador("Piszczek","Defensor", 68, 72, 77, 15, 35, "Borussia Dortmund");
        elencoBVB[4] = new Jogador("R. Guerreiro","Defensor", 69, 74, 82, 17, 27, "Borussia Dortmund");
        elencoBVB[5] = new Jogador("Passlack","Defensor", 66, 70, 78, 17, 22, "Borussia Dortmund");
        elencoBVB[6] = new Jogador("Schulz","Defensor", 66, 61, 79, 17, 27, "Borussia Dortmund");
        elencoBVB[7] = new Jogador("Zagadou","Defensor", 40, 52, 78, 20, 21, "Borussia Dortmund");
        elencoBVB[8] = new Jogador("Akanji","Defensor", 58, 65, 79, 30, 25, "Borussia Dortmund");
        elencoBVB[9] = new Jogador("E. Can","Meio-Campo", 58, 81, 79, 1, 26, "Borussia Dortmund");
        elencoBVB[10] = new Jogador("Witsel","Meio-Campo", 58, 83, 82, 1, 31, "Borussia Dortmund");
        elencoBVB[11] = new Jogador("Dahoud","Meio-Campo", 58, 81, 78, 1, 25, "Borussia Dortmund");
        elencoBVB[12] = new Jogador("T. Hazard","Meio-Campo", 75, 80, 60, 15, 27, "Borussia Dortmund");
        elencoBVB[13] = new Jogador("T. Meunier","Meio-Campo", 75, 83, 70, 15, 29, "Borussia Dortmund");
        elencoBVB[14] = new Jogador("Delaney","Meio-Campo", 74, 83, 60, 15, 29, "Borussia Dortmund");
        elencoBVB[15] = new Jogador("Reinier","Meio-Campo", 65, 72, 60, 15, 18, "Borussia Dortmund");
        elencoBVB[16] = new Jogador("Reus","Meio-Campo", 85, 87, 60, 7, 31, "Borussia Dortmund");
        elencoBVB[17] = new Jogador("J. Brandt","Atacante", 83, 80, 40, 27, 24, "Borussia Dortmund");
        elencoBVB[18] = new Jogador("Moukoko","Atacante", 75, 72, 40, 27, 16, "Borussia Dortmund");
        elencoBVB[19] = new Jogador("Sancho","Atacante", 83, 80, 30, 17, 20,"Borussia Dortmund");
        elencoBVB[20] = new Jogador("Haland","Atacante", 84, 78, 48, 27, 20, "Borussia Dortmund");
               
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoBVB.length; i++) {
            elenco.add(elencoBVB[i]);
        }
        return new Clube("Borussia Dortmund", elenco, (short)5, 800, "dortmund.png", 
                "dortmund_mini.png", "background_dortmund.png", Color.BLACK, 3);
    }
    
    private static Clube psg() {
        Jogador[] elencoPSG = new Jogador[22];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoPSG[0] = new Jogador("K. Navas","Goleiro", 5, 8, 40, 86, 34, "Paris Saint-Germain");
        elencoPSG[1] = new Jogador("Sergio Rico","Goleiro", 5, 8, 40, 83, 27, "Paris Saint-Germain");
        elencoPSG[2] = new Jogador("Diallo","Defensor", 5, 40, 80, 32, 24, "Paris Saint-Germain");
        elencoPSG[3] = new Jogador("J. Bernat","Defensor", 50, 70, 80, 32, 27, "Paris Saint-Germain");
        elencoPSG[4] = new Jogador("Marquinhos","Defensor", 50, 81, 84, 32, 26, "Paris Saint-Germain");
        elencoPSG[5] = new Jogador("Kimpembé","Defensor", 50, 78, 82, 32, 25, "Paris Saint-Germain");
        elencoPSG[6] = new Jogador("T. Kehrer","Defensor", 50, 76, 82, 32, 24, "Paris Saint-Germain");
        elencoPSG[7] = new Jogador("L. Kurzawa","Defensor", 50, 72, 81, 32, 28, "Paris Saint-Germain");
        elencoPSG[8] = new Jogador("Florenzi","Defensor", 50, 72, 77, 32, 29, "Paris Saint-Germain");
        elencoPSG[9] = new Jogador("Dagba","Defensor", 50, 62, 78, 32, 22, "Paris Saint-Germain");
        elencoPSG[10] = new Jogador("Danilo P.","Meio-Campo", 50, 77, 75, 12, 29, "Paris Saint-Germain");
        elencoPSG[11] = new Jogador("I. Gueyé","Meio-Campo", 65, 79, 75, 12, 31, "Paris Saint-Germain");
        elencoPSG[12] = new Jogador("M. Verratti","Meio-Campo", 69, 84, 75, 12, 28, "Paris Saint-Germain");
        elencoPSG[13] = new Jogador("Ander Herrera","Meio-Campo", 70, 83, 72, 12, 31, "Paris Saint-Germain");
        elencoPSG[14] = new Jogador("Rafinha","Meio-Campo", 75, 83, 72, 12, 27, "Paris Saint-Germain");
        elencoPSG[15] = new Jogador("J. Draxler","Meio-Campo", 79, 77, 52, 12, 27, "Paris Saint-Germain");
        elencoPSG[16] = new Jogador("Neymar","Atacante", 90, 86, 52, 12, 28, "Paris Saint-Germain");
        elencoPSG[17] = new Jogador("Di María","Atacante", 86, 85, 52, 12, 32, "Paris Saint-Germain");
        elencoPSG[18] = new Jogador("P. Sarabia","Atacante", 83, 80, 62, 2, 28, "Paris Saint-Germain");
        elencoPSG[19] = new Jogador("K. Mbappé","Atacante", 87, 81, 58, 2, 22, "Paris Saint-Germain");
        elencoPSG[20] = new Jogador("M. Icardi","Atacante", 87, 71, 52, 2, 27, "Paris Saint-Germain");
        elencoPSG[21] = new Jogador("Moise Kean","Atacante", 84, 72, 42, 21, 20, "Paris Saint-Germain");
       
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoPSG.length; i++) {
            elenco.add(elencoPSG[i]);
        }
        return new Clube("Paris Saint-Germain", elenco, (short)5, 800, "psg.png", 
                "psg_mini.png", "background_psg.png", Color.white, 4);
    }
        
    private static Clube juve() {
        Jogador[] elencoJuve = new Jogador[1];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoJuve[0] = new Jogador("Szczesny","Goleiro", 5, 8, 40, 85, 30, "FC Barcelona");
       
        ArrayList<Jogador> elenco = new ArrayList();
        for (int i = 0; i < elencoJuve.length; i++) {
            elenco.add(elencoJuve[i]);
        }
        return new Clube("Juventus FC", elenco, (short)5, 800, "juve.png", 
                "juve_mini.png", "background_juve.png", Color.white, 0);
    }
    
//</editor-fold>
}

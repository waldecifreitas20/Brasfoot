package classes;

import classes.clube.BaseClube;
import classes.clube.Clube;
import classes.clube.Jogador;
import classes.clube.Jogador.Habilidade;
import classes.clube.Jogador.Posicao;
import classes.clube.SemClube;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import views.TelaInicial;

public class ClassePrincipal{   
    
    private static List<Clube> allClubs = initClubes();  
    private static List<Jogador> allPlayers = initJogadores();    
    private static SemClube jogadoresSemClube = new SemClube();
    public static int ADD = 1;
    public static int REMOVE = 0;
    public static void main(String[] args) {          
        new TelaInicial().setVisible(true);   
   
    }
    public static List<Clube> baseDadosClubes() {
        return allClubs;
    }
        
    public static void updateSemClube(Jogador semClube, int acao) {
        if (semClube != null) {
            if (acao == 1) {
                jogadoresSemClube.addAtleta(semClube);                
            } else if (acao == 0) {
                jogadoresSemClube.removerAtleta(semClube);                   
            }
        }
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
    
    public static List<Jogador> baseDadosJogadores() {     
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
    private static List<Clube> initClubes() {
        final Clube clubes[] = new Clube[6];         
        clubes[0] = barcelona();
        clubes[1] = realMadrid();       
        clubes[2] = bayern();      
        clubes[3] = dortmund();             
        clubes[4] = psg();             
        clubes[5] = juve();             
        List<Clube> todosClubes = new ArrayList();
        for (int i = 0; i < clubes.length; i++) {
            todosClubes.add(clubes[i]);
        }
        return todosClubes;
    }
    
    private static List<Jogador> initJogadores() {
        List<Jogador> todosJogadores = new ArrayList();
        for (int i = 0; i < allClubs.size(); i++) {            
            for (int j = 0; j < allClubs.get(i).getJogadores().size(); j++) {
              todosJogadores.add(allClubs.get(i).getJogadores().get(j));
            }            
        } 
        return todosJogadores;
    }
        
    private static Clube barcelona() {
        Jogador[] elencoBarca = new Jogador[20];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBarca[0] = new Jogador("Ter Stegen",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 86), 28, "FC Barcelona");
        elencoBarca[1] = new Jogador("Neto", Posicao.GOLEIRO, new Habilidade(14, 16, 50, 83), 31, "FC Barcelona");
        elencoBarca[2] = new Jogador("Piqué", Posicao.DEFENSOR, new Habilidade(58, 62, 84, 40), 33, "FC Barcelona");        
        elencoBarca[3] = new Jogador("Lenglet", Posicao.DEFENSOR, new Habilidade(54, 62, 80, 10), 25, "FC Barcelona");
        elencoBarca[4] = new Jogador("Jordi Alba", Posicao.DEFENSOR, new Habilidade(76, 71, 81, 5), 31, "FC Barcelona");
        elencoBarca[5] = new Jogador("Araújo", Posicao.DEFENSOR, new Habilidade(63, 61, 73, 5), 21, "FC Barcelona");
        elencoBarca[6] = new Jogador("Dest", Posicao.DEFENSOR, new Habilidade(65, 62, 75, 10), 20, "FC Barcelona");
        elencoBarca[7] = new Jogador("Umtiti", Posicao.DEFENSOR, new Habilidade(44, 56, 84, 5), 27, "FC Barcelona");
        elencoBarca[8] = new Jogador("Sergio Busquets",Posicao.MEIO_CAMPO, new Habilidade(68, 84, 72, 8), 32, "FC Barcelona");
        elencoBarca[9] = new Jogador("Pjanic", Posicao.MEIO_CAMPO, new Habilidade(68, 83, 71, 9), 30, "FC Barcelona");
        elencoBarca[10] = new Jogador("Puing", Posicao.MEIO_CAMPO, new Habilidade(70, 75, 40, 5), 21, "FC Barcelona");
        elencoBarca[11] = new Jogador("P. Coutinho", Posicao.MEIO_CAMPO, new Habilidade(84, 86, 40, 5), 28, "FC Barcelona");
        elencoBarca[12] = new Jogador("F. de Jong", Posicao.MEIO_CAMPO, new Habilidade(65, 82, 76, 10), 23, "FC Barcelona");
        elencoBarca[13] = new Jogador("A. Griezmann", Posicao.ATACANTE, new Habilidade(84, 78, 60, 4), 29, "FC Barcelona");
        elencoBarca[14] = new Jogador("Braithwaite", Posicao.ATACANTE, new Habilidade(78, 68, 50, 5), 29, "FC Barcelona");
        elencoBarca[15] = new Jogador("L. Messi", Posicao.ATACANTE, new Habilidade(94, 88, 57, 2), 33, "FC Barcelona");
        elencoBarca[16] = new Jogador("Pedri", Posicao.ATACANTE, new Habilidade(76, 71, 40, 5), 18, "FC Barcelona");
        elencoBarca[17] = new Jogador("A. Fati", Posicao.ATACANTE, new Habilidade(79, 72, 40, 5), 18, "FC Barcelona");
        elencoBarca[18] = new Jogador("Dembélé", Posicao.ATACANTE, new Habilidade(81, 76, 40, 5), 23, "FC Barcelona");
        elencoBarca[19] = new Jogador("Trincão", Posicao.ATACANTE, new Habilidade(74, 76, 40, 5), 21, "FC Barcelona");
        List<Jogador> elenco = new ArrayList();
        for (Jogador jogador : elencoBarca) {
            elenco.add(jogador);
        }
        return new Clube("FC Barcelona", elenco, (short)5, 800, "barcelona.png", 
                "barcelona_mini.png", "background_barcelona.png", Color.yellow, 0);
    }
    
    private static Clube realMadrid() {
        Jogador[] elencoRMD = new Jogador[24];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoRMD[0] = new Jogador("Thibaut Courtois",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 87), 28, "Real Madrid CF");
        elencoRMD[1] = new Jogador("Andriy Lunin", Posicao.GOLEIRO, new Habilidade(5, 8, 40, 74), 21, "Real Madrid CF");
        elencoRMD[2] = new Jogador("Sergio Ramos", Posicao.DEFENSOR, new Habilidade(70, 62, 87, 40), 34, "Real Madrid CF");
        elencoRMD[3] = new Jogador("Raphael Varane", Posicao.DEFENSOR, new Habilidade(54, 62, 83, 10), 27, "Real Madrid CF");
        elencoRMD[4] = new Jogador("Nacho Fernandéz", Posicao.DEFENSOR, new Habilidade(54, 62, 82, 10), 30, "Real Madrid CF");
        elencoRMD[5] = new Jogador("E. Militão", Posicao.DEFENSOR, new Habilidade(54, 62, 79, 10), 22, "Real Madrid CF");
        elencoRMD[6] = new Jogador("Marcelo", Posicao.DEFENSOR, new Habilidade(77, 71, 83, 5), 32, "Real Madrid CF");
        elencoRMD[7] = new Jogador("Mendy", Posicao.DEFENSOR, new Habilidade(77, 71, 84, 5), 25, "Real Madrid CF");
        elencoRMD[8] = new Jogador("Carvajal", Posicao.DEFENSOR, new Habilidade(74, 62, 84, 10), 28, "Real Madrid CF");
        elencoRMD[9] = new Jogador("Odriozola", Posicao.DEFENSOR, new Habilidade(64, 62, 78, 10), 25, "Real Madrid CF");
        elencoRMD[10] = new Jogador("T. Kroos",Posicao.MEIO_CAMPO, new Habilidade(69, 85, 77, 8), 30, "Real Madrid CF");
        elencoRMD[11] = new Jogador("Isco",Posicao.MEIO_CAMPO, new Habilidade(78, 85, 67, 8), 28, "Real Madrid CF");
        elencoRMD[12] = new Jogador("L. Modric", Posicao.MEIO_CAMPO, new Habilidade(68, 84, 75, 9), 35, "Real Madrid CF");
        elencoRMD[13] = new Jogador("F. Valverde", Posicao.MEIO_CAMPO, new Habilidade(69, 83, 78, 9), 22, "Real Madrid CF");
        elencoRMD[14] = new Jogador("Marco Asensio", Posicao.MEIO_CAMPO, new Habilidade(81, 84, 65, 9), 24, "Real Madrid CF");
        elencoRMD[15] = new Jogador("Casemiro", Posicao.MEIO_CAMPO, new Habilidade(65, 88, 80, 10), 28, "Real Madrid CF");
        elencoRMD[16] = new Jogador("E. Hazard", Posicao.ATACANTE, new Habilidade(86, 82, 40, 4), 29, "Real Madrid CF");
        elencoRMD[17] = new Jogador("Benzema", Posicao.ATACANTE, new Habilidade(86, 87, 57, 2), 32, "Real Madrid CF");
        elencoRMD[18] = new Jogador("Odegaard",Posicao.ATACANTE, new Habilidade(76, 75, 67, 8), 22, "Real Madrid CF");
        elencoRMD[19] = new Jogador("Lucas Vázquez",Posicao.ATACANTE, new Habilidade(76, 75, 77, 8), 29, "Real Madrid CF");
        elencoRMD[20] = new Jogador("L. Jovic", Posicao.ATACANTE, new Habilidade(80, 65, 57, 2), 23, "Real Madrid CF");
        elencoRMD[21] = new Jogador("Mariano Díaz", Posicao.ATACANTE, new Habilidade(78, 55, 57, 2), 27, "Real Madrid CF");
        elencoRMD[22] = new Jogador("Rodrygo", Posicao.ATACANTE, new Habilidade(76, 69, 40, 5), 19, "Real Madrid CF");
        elencoRMD[23] = new Jogador("Vinicius Júnior", Posicao.ATACANTE, new Habilidade(75, 68, 40, 5), 20, "Real Madrid CF");
        List<Jogador> elenco = new ArrayList();
       
        for (Jogador jogador : elencoRMD) {
            elenco.add(jogador);
        }
        return new Clube("Real Madrid CF", elenco, (short)5, 800, "realmadrid.png", 
                "realmadrid_mini.png", "background_real.png", Color.black, 1);
    }
    
    private static Clube bayern() {
        Jogador[] elencoBayern = new Jogador[23];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBayern[0]  = new Jogador("Manuel Neuer",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 90), 34, "Bayern de Munique");
        elencoBayern[1]  = new Jogador("Nübel",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 83), 25, "Bayern de Munique");
        elencoBayern[2]  = new Jogador("A. Davies",Posicao.DEFENSOR, new Habilidade(68, 72, 85, 15), 20, "Bayern de Munique");
        elencoBayern[3]  = new Jogador("Lucas Hernández",Posicao.DEFENSOR, new Habilidade(70, 72, 80, 15), 24, "Bayern de Munique");
        elencoBayern[4]  = new Jogador("Kimmich",Posicao.DEFENSOR, new Habilidade(59, 78, 87, 17), 25, "Bayern de Munique");
        elencoBayern[5]  = new Jogador("Sarr",Posicao.DEFENSOR, new Habilidade(40, 52, 82, 20), 28, "Bayern de Munique");
        elencoBayern[6]  = new Jogador("Süle",Posicao.DEFENSOR, new Habilidade(40, 42, 84, 10), 25, "Bayern de Munique");
        elencoBayern[7]  = new Jogador("Pavard",Posicao.DEFENSOR, new Habilidade(60, 62, 83, 10), 24, "Bayern de Munique");
        elencoBayern[8]  = new Jogador("Richards",Posicao.DEFENSOR, new Habilidade(40, 42, 76, 20), 20, "Bayern de Munique");
        elencoBayern[9]  = new Jogador("J. Boateng",Posicao.DEFENSOR, new Habilidade(40, 52, 85, 20), 32, "Bayern de Munique");
        elencoBayern[10] = new Jogador("Alaba",Posicao.DEFENSOR, new Habilidade(70, 80, 83, 10), 28, "Bayern de Munique");
        elencoBayern[11] = new Jogador("Goretzka",Posicao.MEIO_CAMPO, new Habilidade(58, 83, 62, 1), 25, "Bayern de Munique");
        elencoBayern[12] = new Jogador("Javi Martínez",Posicao.MEIO_CAMPO, new Habilidade(58, 82, 60, 15), 32, "Bayern de Munique");
        elencoBayern[13] = new Jogador("Tolisso",Posicao.MEIO_CAMPO, new Habilidade(72, 84, 70, 7), 26, "Bayern de Munique");
        elencoBayern[14] = new Jogador("T. Müller",Posicao.MEIO_CAMPO, new Habilidade(87, 86, 60, 7), 31, "Bayern de Munique");
        elencoBayern[15] = new Jogador("Douglas Costa",Posicao.MEIO_CAMPO, new Habilidade(82, 85, 60, 7), 30, "Bayern de Munique");
        elencoBayern[16] = new Jogador("R. Lewandowski",Posicao.ATACANTE, new Habilidade(93, 80, 40, 27), 32, "Bayern de Munique");
        elencoBayern[17] = new Jogador("L. Sané",Posicao.ATACANTE, new Habilidade(85, 82, 30, 17), 24, "Bayern de Munique");
        elencoBayern[18] = new Jogador("Arp",Posicao.ATACANTE, new Habilidade(80, 72, 30, 17), 20, "Bayern de Munique");
        elencoBayern[19] = new Jogador("Tillman",Posicao.ATACANTE, new Habilidade(75, 72, 30, 17), 18, "Bayern de Munique");
        elencoBayern[20] = new Jogador("S. Gnabry",Posicao.ATACANTE, new Habilidade(87, 85, 48, 27), 25, "Bayern de Munique");
        elencoBayern[21] = new Jogador("Choupo-Moting",Posicao.ATACANTE, new Habilidade(83, 65, 48, 27), 31, "Bayern de Munique");
        elencoBayern[22] = new Jogador("K. Coman",Posicao.ATACANTE, new Habilidade(85, 84, 48, 20), 24, "Bayern de Munique");
               
        List<Jogador> elenco = new ArrayList();
        for (Jogador jogador : elencoBayern) {
            elenco.add(jogador);
        }
        return new Clube("Bayern de Munique", elenco, (short)5, 800, "bayern.png", 
                "bayern_mini.png", "background_bayern.png", Color.white, 2);
    }
    
    private static Clube dortmund() {
        Jogador[] elencoBVB = new Jogador[21];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoBVB[0] = new Jogador("Burki",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 83), 30, "Borussia Dortmund");
        elencoBVB[1] = new Jogador("Hitz",Posicao.GOLEIRO, new Habilidade(5, 8, 40, 80), 33, "Borussia Dortmund");
        elencoBVB[2] = new Jogador("Schmelzer",Posicao.DEFENSOR, new Habilidade(68, 72, 77, 15), 32, "Borussia Dortmund");
        elencoBVB[3] = new Jogador("Piszczek",Posicao.DEFENSOR, new Habilidade(68, 72, 77, 15), 35, "Borussia Dortmund");
        elencoBVB[4] = new Jogador("R. Guerreiro",Posicao.DEFENSOR, new Habilidade(69, 74, 82, 17), 27, "Borussia Dortmund");
        elencoBVB[5] = new Jogador("Passlack",Posicao.DEFENSOR, new Habilidade(66, 70, 78, 17), 22, "Borussia Dortmund");
        elencoBVB[6] = new Jogador("Schulz",Posicao.DEFENSOR, new Habilidade(66, 61, 79, 17), 27, "Borussia Dortmund");
        elencoBVB[7] = new Jogador("Zagadou",Posicao.DEFENSOR, new Habilidade(40, 52, 78, 20), 21, "Borussia Dortmund");
        elencoBVB[8] = new Jogador("Akanji",Posicao.DEFENSOR, new Habilidade(58, 65, 79, 30), 25, "Borussia Dortmund");
        elencoBVB[9] = new Jogador("E. Can",Posicao.MEIO_CAMPO, new Habilidade(58, 81, 79, 1), 26, "Borussia Dortmund");
        elencoBVB[10] = new Jogador("Witsel",Posicao.MEIO_CAMPO, new Habilidade(58, 83, 82, 1), 31, "Borussia Dortmund");
        elencoBVB[11] = new Jogador("Dahoud",Posicao.MEIO_CAMPO, new Habilidade(58, 81, 78, 1), 25, "Borussia Dortmund");
        elencoBVB[12] = new Jogador("T. Hazard",Posicao.MEIO_CAMPO, new Habilidade(75, 80, 60, 15), 27, "Borussia Dortmund");
        elencoBVB[13] = new Jogador("T. Meunier",Posicao.MEIO_CAMPO, new Habilidade(75, 83, 70, 15), 29, "Borussia Dortmund");
        elencoBVB[14] = new Jogador("Delaney",Posicao.MEIO_CAMPO, new Habilidade(74, 83, 60, 15), 29, "Borussia Dortmund");
        elencoBVB[15] = new Jogador("Reinier",Posicao.MEIO_CAMPO, new Habilidade(65, 72, 60, 15), 18, "Borussia Dortmund");
        elencoBVB[16] = new Jogador("Reus",Posicao.MEIO_CAMPO, new Habilidade(85, 87, 60, 7), 31, "Borussia Dortmund");
        elencoBVB[17] = new Jogador("J. Brandt",Posicao.ATACANTE, new Habilidade(83, 80, 40, 27), 24, "Borussia Dortmund");
        elencoBVB[18] = new Jogador("Moukoko",Posicao.ATACANTE, new Habilidade(75, 72, 40, 27), 16, "Borussia Dortmund");
        elencoBVB[19] = new Jogador("Sancho",Posicao.ATACANTE, new Habilidade(83, 80, 30, 17), 20,"Borussia Dortmund");
        elencoBVB[20] = new Jogador("Haland",Posicao.ATACANTE, new Habilidade(84, 78, 48, 27), 20, "Borussia Dortmund");
               
        List<Jogador> elenco = new ArrayList();
        for (Jogador jogador : elencoBVB) {
            elenco.add(jogador);
        }
        return new Clube("Borussia Dortmund", elenco, (short)5, 800, "dortmund.png", 
                "dortmund_mini.png", "background_dortmund.png", Color.BLACK, 3); 
    }
    
    private static Clube psg() {
        Jogador[] elencoPSG = new Jogador[22];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        
        elencoPSG[0] = new Jogador("K. Navas",Posicao.GOLEIRO, new Habilidade(5,8,40,86), 34, "Paris Saint-Germain");
        elencoPSG[1] = new Jogador("Sergio Rico",Posicao.GOLEIRO,new Habilidade(5, 8, 40, 83), 27, "Paris Saint-Germain");
        elencoPSG[2] = new Jogador("Diallo",Posicao.DEFENSOR, new Habilidade(5, 40, 80, 32), 24, "Paris Saint-Germain");
        elencoPSG[3] = new Jogador("J. Bernat",Posicao.DEFENSOR, new Habilidade(50, 70, 80, 32), 27, "Paris Saint-Germain");
        elencoPSG[4] = new Jogador("Marquinhos",Posicao.DEFENSOR, new  Habilidade(50, 81, 84, 32), 26, "Paris Saint-Germain");
        elencoPSG[5] = new Jogador("Kimpembé",Posicao.DEFENSOR, new Habilidade(50, 78, 82, 32), 25, "Paris Saint-Germain");
        elencoPSG[6] = new Jogador("T. Kehrer",Posicao.DEFENSOR, new Habilidade(50, 76, 82, 32), 24, "Paris Saint-Germain");
        elencoPSG[7] = new Jogador("L. Kurzawa",Posicao.DEFENSOR, new Habilidade(50, 72, 81, 32), 28, "Paris Saint-Germain");
        elencoPSG[8] = new Jogador("Florenzi",Posicao.DEFENSOR, new Habilidade(50, 72, 77, 32), 29, "Paris Saint-Germain");
        elencoPSG[9] = new Jogador("Dagba",Posicao.DEFENSOR, new Habilidade(50, 62, 78, 32), 22, "Paris Saint-Germain");
        elencoPSG[10] = new Jogador("Danilo P.",Posicao.MEIO_CAMPO, new Habilidade(50, 77, 75, 12), 29, "Paris Saint-Germain");
        elencoPSG[11] = new Jogador("I. Gueyé",Posicao.MEIO_CAMPO, new Habilidade(65, 79, 75, 12), 31, "Paris Saint-Germain");
        elencoPSG[12] = new Jogador("M. Verratti",Posicao.MEIO_CAMPO, new Habilidade(69, 84, 75, 12), 28, "Paris Saint-Germain");
        elencoPSG[13] = new Jogador("Ander Herrera",Posicao.MEIO_CAMPO, new Habilidade(70, 83, 72, 12), 31, "Paris Saint-Germain");
        elencoPSG[14] = new Jogador("Rafinha",Posicao.MEIO_CAMPO, new Habilidade(75, 83, 72, 12), 27, "Paris Saint-Germain");
        elencoPSG[15] = new Jogador("J. Draxler",Posicao.MEIO_CAMPO, new Habilidade(79, 77, 52, 12), 27, "Paris Saint-Germain");
        elencoPSG[16] = new Jogador("Neymar",Posicao.ATACANTE, new Habilidade(90, 86, 52, 12), 28, "Paris Saint-Germain");
        elencoPSG[17] = new Jogador("Di María",Posicao.ATACANTE, new Habilidade(86, 85, 52, 12), 32, "Paris Saint-Germain");
        elencoPSG[18] = new Jogador("P. Sarabia",Posicao.ATACANTE, new Habilidade(83, 80, 62, 2), 28, "Paris Saint-Germain");
        elencoPSG[19] = new Jogador("K. Mbappé",Posicao.ATACANTE, new Habilidade(87, 81, 58, 2), 22, "Paris Saint-Germain");
        elencoPSG[20] = new Jogador("M. Icardi",Posicao.ATACANTE, new Habilidade(87, 71, 52, 2), 27, "Paris Saint-Germain");
        elencoPSG[21] = new Jogador("Moise Kean","Atacante", new Habilidade(84, 72, 42, 21), 20, "Paris Saint-Germain");
       
        List<Jogador> elenco = new ArrayList();
        for (Jogador jogador : elencoPSG) {
            elenco.add(jogador);
        }
        return new Clube("Paris Saint-Germain", elenco, (short)5, 800, "psg.png", 
                "psg_mini.png", "background_psg.png", Color.white, 4);
    }
        
    private static Clube juve() {
        Jogador[] elencoJuve = new Jogador[1];
        //new Jogador("Neymar Jr", "Atacante", (ataque)89,(meio) 85,(defesa) 34,(goleiro) 8,(idade) 28);
        elencoJuve[0] = new Jogador("Szczesny","Goleiro", new Habilidade(5, 8, 40, 85), 30, "FC Barcelona");
       
        List<Jogador> elenco = new ArrayList();
        for (Jogador jogador : elencoJuve) {
            elenco.add(jogador);
        }
        return new Clube("Juventus FC", elenco, (short)5, 800, "juve.png", 
                "juve_mini.png", "background_juve.png", Color.white, 0);
    }
    
//</editor-fold>
}

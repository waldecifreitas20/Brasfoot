package classes.competitions;

import static classes.MainClass.getClub;
import static classes.MainClass.ROUND;
import classes.club.Club;
import exceptions.ObjectNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SuperChampions {
    private List<Club> participants ;
    private Stack<Club> availableTeam;
 
    private Match[][] matchs;    
    
    public SuperChampions(List<Club> teams) {
        this.participants = teams;
        this.availableTeam = new Stack<>();
        this.matchs = new Match[3][10];
    }   
    //<editor-fold>
    /*
    public String drawRound() {
        availableTeam.removeAllElements();
        availableTeam.addAll(participants);            
        
        Collections.shuffle(availableTeam);            
        Club homeTeam = availableTeam.pop();
        Collections.shuffle(availableTeam);            
        Club awayTeam = availableTeam.pop();
        String game = "";
        if (homeTeam.notPlayed(awayTeam)) {
            homeTeam.getStats().addClubsPlayed(awayTeam);               
            this.games++;
            game = homeTeam.getName()+" x "+awayTeam.getName();
           
        } else {
            availableTeam.push(awayTeam);
            availableTeam.push(homeTeam);

        }
        return game;      
    }
    */
    //</editor-fold>
    
    public boolean loadAllRounds() {
        File root = new File("");
        String relativePath = "rounds.txt";
        boolean error = false;
        Path directory = Paths.get("C:/"+relativePath);
        
        try {
            List<String> allMatchs = new ArrayList();
            try {
                allMatchs = Files.readAllLines(directory);                
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            String match[] = new String[2];
            int round = 0;
            int game = 0;
            Match[][] games = new Match[3][10];
            for (String line : allMatchs) {   
                if (line.equals("---")) {
                    round++;
                    game = 0;                 
                } else {
                    match = line.split("&");
                    Club home = getClub(match[0].trim());
                    Club away = getClub(match[1].trim());
                    this.matchs[game][round] = new Match(home, away);
                    game++;                    
                }              
            }    
           
        } catch (ObjectNotFoundException e) {
            e.printStackTrace();          
            
        }
        return true;
    }
    
    public List<Club> getParticipants() {
        return participants;
    }

    public Stack<Club> getAvailableTeam() {
        return availableTeam;
    }
    
    public Match[] getMatchs() {
        
        System.out.println(ROUND);
        Match[] games = new Match[3];       
        for (int g = 0; g < 3; g++) {
            games[g] = matchs[g][ROUND];
        }
        ROUND++;
        return games;
    }    

}

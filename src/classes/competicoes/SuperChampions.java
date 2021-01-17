package classes.competicoes;

import static classes.MainClass.getClub;
import classes.club.Club;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SuperChampions {
    private List<Club> participants ;
    private Stack<Club> availableTeam;
    private List<Match> round, matchRecord;
    public int games = 0;
    public SuperChampions(List<Club> teams) {
        this.participants = teams;
        this.availableTeam = new Stack<>();
        this.round = new ArrayList<>();
        this.matchRecord = new ArrayList<>();
    }   

    public String drawRound() {
        availableTeam.removeAllElements();
        availableTeam.addAll(participants);            
        
        Collections.shuffle(availableTeam);            
        Club homeTeam = availableTeam.pop();
        Collections.shuffle(availableTeam);            
        Club awayTeam = availableTeam.pop();
       // System.out.println(availableTeam.size());
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
    
    public void list() {
        loadAllRounds();
        for (int i = 0; i < this.round.size(); i++) {
            System.out.println(this.round.get(i).getHomeTeam().getName()+
                    " x " + this.round.get(i).getAwayTeam().getName());
        }
    }
    public void loadAllRounds() {
        File root = new File("");
        String relativePath = "/src/classes/rounds.txt";
        Path directory = Paths.get(root.getAbsolutePath()+relativePath);
        try {
            List<String> games = Files.readAllLines(directory);
            String clubs[] = new String[2];
            for (int i = 0; i < games.size(); i++) {
                clubs = games.get(i).split("&");
                Club home = getClub(clubs[0].trim());
                Club away = getClub(clubs[1].trim());
                this.round.add(new Match(home, away));                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Club> getParticipants() {
        return participants;
    }

    public Stack<Club> getAvailableTeam() {
        return availableTeam;
    }

    public List<Match> getRound() {
        return round;
    }

    public List<Match> getMatchRecord() {
        return matchRecord;
    }
}

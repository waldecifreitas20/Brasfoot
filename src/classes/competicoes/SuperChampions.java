package classes.competicoes;

import classes.club.Club;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SuperChampions {
    private List<Club> participants ;
    private Stack<Club> availableTeam;
    private List<Match> round, matchRecord;

    public SuperChampions(List<Club> teams) {
        this.participants = teams;
        this.availableTeam = new Stack<>();
        this.round = new ArrayList<>();
        this.matchRecord = new ArrayList<>();
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

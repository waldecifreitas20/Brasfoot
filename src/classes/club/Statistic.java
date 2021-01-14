package classes.club;


import java.util.ArrayList;
import java.util.List;

public class Statistic {
    private int 
        points,
        goalsConceded,
        golsFor,
        goalDifference,
        won,
        draw,
        played,
        losses;
    
    private List<Club> clubsPlayed;

    public Statistic(){
        this.won = 0;
        this.draw = 0;
        this.points = 0;
        this.played = 0;
        this.losses = 0;
        this.golsFor = 0;
        this.clubsPlayed = new ArrayList();
        this.goalDifference = 0;
        this.goalsConceded = 0;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public int getGolsFor() {
        return golsFor;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getWins() {
        return won;
    }

    public int getDraws() {
        return draw;
    }

    public int getPlayed() {
        return played;
    }

    public int getLosses() {
        return losses;
    }

    public List<Club> getClubsPlayed() {
        return clubsPlayed;
    }

    public void addGoalsConceded(int goalsConceded) {
        this.goalsConceded += goalsConceded;
    }

    public void addGolsFor(int golsFor) {
        this.golsFor += golsFor;
        this.updateGoalDifference();
    }

    private void updateGoalDifference() {
        this.goalDifference = this.golsFor - this.goalsConceded;
    }

    public void addWin() {
        this.won++;
        this.played++;
        this.points += 3;
    }

    public void addDraw() {
        this.draw ++;
        this.played++;
        this.points += 1;
    }

    public void addLosses() {
        this.losses++;
        this.played++;
    }

    public boolean addClubsPlayed(Club clubPlayed) {
        if (this.clubsPlayed.contains(clubPlayed)) {
            return false;
        } 
        
        this.clubsPlayed.add(clubPlayed);
        
        return true;
    }
}

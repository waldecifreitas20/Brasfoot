
package classes.competicoes;

import classes.club.Club;

public class Match {         
    private Club homeTeam, awayTeam;   

    public Match(Club homeTeam, Club awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Club getHomeTeam() {
        return homeTeam;
    }

    public Club getAwayTeam() {
        return awayTeam;
    }    
    
}

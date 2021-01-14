package classes.competicoes;

;
import classes.club.Club;
import java.util.List;

public class Leaderboard {
    private List<Club> participants;
    
    public Leaderboard(List<Club> participants) {
        this.participants = participants;
    }
    
    public void addWin (Club club) {
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).equals(club)) {
                this.participants.get(i).getStats().addWin();
            }
        }
        
        
    }
    
    public void addDraw (Club club) {
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).equals(club)) {
                this.participants.get(i).getStats().addDraw();
            }
        }
       
    }
    
    public void addLosse (Club club) {
        for (int i = 0; i < participants.size(); i++) {
            if (participants.get(i).equals(club)) {
                this.participants.get(i).getStats().addLosses();
            }
        }        
    }
    
    private void updateTable() {
       int tam = this.participants.size();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (this.participants.get(i).getStats().getPoints() > 
                        this.participants.get(j).getStats().getPoints()) {
                    Club aux = this.participants.get(i);
                    this.participants.set(i, this.participants.get(j));
                    this.participants.set(j, aux);
                }
            }           
        }
    }
    
    public void toList() {
        for (int i = 0; i < this.participants.size(); i++) {
            System.out.printf("%d| %s  - %d pts. | %dV  %dE %dD\n", i+1, this.participants.get(i).getName(), 
                    this.participants.get(i).getStats().getPoints(), 
                    participants.get(i).getStats().getWins(),
                    participants.get(i).getStats().getDraws(),
                    participants.get(i).getStats().getLosses());
        }
    }
    
    public List<Club> getParticipants() {
        updateTable();
        return participants;
    }
    
}

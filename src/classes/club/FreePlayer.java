package classes.club;

import java.util.ArrayList;

public class FreePlayer extends BaseClub{   

    public FreePlayer() {
        super("Sem Clube", new ArrayList<>());      
        
    }
    
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public void removePlayer(Player player) {
        this.players.remove(player);
    }
     
}

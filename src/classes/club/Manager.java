package classes.club;

import exceptions.InvalidValueException;
import exceptions.ObjectNotFoundException;

public class Manager {
    private final String name; 
    private Club club;
    
    public Manager(String name, Club club) {
        this.name = name;      
        this.club = club;
        this.club.setControlled(true);
    }
    
    public Club.NegotiationResponse negotiateWithFreePlayer(Player player) 
            throws ObjectNotFoundException {
        
        return this.club.negotiateWithFreePlayer(player);  
    } 
    
    public Club.NegotiationResponse buyPlayer(Club club, Player player, double offer) 
            throws ObjectNotFoundException {        
     
        return this.club.negotiateWithClub(club, player, offer);         
    }
    
    public void LetFreePlayer(Player player) 
            throws ObjectNotFoundException{    
        
        this.club.breakContract(player);
    } 
    
    public Club sellPlayer(Player player) 
            throws ObjectNotFoundException {
        
        return this.club.sellPlayer(player);       
    }   
    
    // Getters
    public String getName() {
        return name;
    }
   
    public Club getClub() {
        return club;
    }
    
    
}

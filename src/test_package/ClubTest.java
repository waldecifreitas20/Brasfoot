package test_package;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.BaseClub;
import classes.club.Club;
import classes.club.Player;
import exceptions.ObjectNotFoundException;

class ClubTest {

	@Test
	void transferNotPossibleClubTest() {
		Club me = null, other = null;
		Player player = null; 
		boolean possible = false;	
		try {
			me = MainClass.getClub("Real");
			other = MainClass.getClub("Barcelona");
			double offer = 1300;
			player = other.getPlayers().get(0);
			possible = me.transferIsPossible(offer, player);
			
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();
		}
		
		Assertions.assertFalse(possible);
		
	}
	
	@Test
	void buyPlayerClubTest() {
		Club me = null, other = null;
		Player player = null; 
		Club.NegotiationResponse response = null;
		try {
			me = MainClass.getClub("Real");
			other = MainClass.getClub("Barcelona");
			double offer = 130;
			player = other.getPlayers().get(0);
			response = me.negotiateWithClub(other, player, offer);
			
			
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();
		}
		
		System.out.print(response.getResponse());
		
	}
	

}

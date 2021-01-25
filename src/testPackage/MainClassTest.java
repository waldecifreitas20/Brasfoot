package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.Club;
import classes.club.Player;
import exceptions.ObjectNotFoundException;

class MainClassTest {

	@Test
	void getPlayertest() {
		Player player = null;		
		try {
			player = MainClass.getPlayer("Neymar");
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		Assertions.assertNotNull(player);
	}
	
	@Test
	void getClubtest() {
		Club club = null;
		
		try {
			club = MainClass.getClub("Juve");
		} catch (ObjectNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		Assertions.assertNotNull(club);
	}
	

}

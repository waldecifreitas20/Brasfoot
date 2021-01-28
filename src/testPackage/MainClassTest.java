package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.Club;
import classes.club.Player;
import exceptions.ObjectNotFoundException;

class MainClassTest {

	@Test
	void startTest() {
		MainClass main = new MainClass();
		List<Club> all = main.clubsDataBase();
		
		Assertions.assertNotNull(all.get(0));
		Assertions.assertEquals(all.size(), 6);
	}
	
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

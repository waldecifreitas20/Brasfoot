package test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.Club;
import classes.club.Player;
import exceptions.ObjectNotFoundException;

class MainClassTest {

	@Test
	void getPlayerTest() {
		Player anyPlayer;
		try {
			anyPlayer = MainClass.getPlayer("Neymar");
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();		
			anyPlayer = null;
		}
		Assertions.assertEquals(anyPlayer.getName(), "Neymar");
	}
	
	@Test
	void getPlayerErrorTest() {
		Player anyPlayer;
		try {
			anyPlayer = MainClass.getPlayer("Neimar");
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();		
			anyPlayer = null;
		}
		Assertions.assertNull(anyPlayer);
	}
	
	@Test
	void getClubTest() {
		Club anyClub;
		try {
			anyClub = MainClass.getClub("Juve");
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();		
			anyClub = null;
		}
		Assertions.assertEquals(anyClub.getName(), "Juventus FC");
	}
	
	@Test
	void getClubErrorTest() {
		Club anyClub;
		try {
			anyClub = MainClass.getClub("Time do cr7");
		} catch (ObjectNotFoundException e) {			
			e.printStackTrace();		
			anyClub = null;
		}
		Assertions.assertNull(anyClub);
	}
	
	@Test
	void updateFreePlayerTest() {
		String[] args = {"a", "b", "C"};
		MainClass.main(args);
	}
}

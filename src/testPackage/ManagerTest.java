package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.Club;
import classes.club.Manager;
import classes.club.Player;
import exceptions.ObjectNotFoundException;

class ManagerTest {

	@Test
	void BuyPlayertest() throws ObjectNotFoundException {
		Club club = MainClass.getClub("Juve");
		Manager manager = new Manager("Andrea Pirlo", club);
		
		Club seller = MainClass.getClub("Real");
		Player terStegen = seller.getPlayers().get(0);
		
		Club.NegotiationResponse response;
		response = manager.buyPlayer(seller, terStegen , 170);
		
		Assertions.assertTrue(response.isResponse());
	}
	
	@Test
	void sellPlayerTest() throws ObjectNotFoundException {
		Club club = MainClass.getClub("Paris");
		Manager manager = new Manager("Julian Nagelsmann", club);
		Player navas = club.getPlayers().get(0);
		
		Club buyer = manager.sellPlayer(navas);
	
		Assertions.assertNotNull(buyer);
		Assertions.assertNotEquals(club.getName(), buyer.getName());
	}
	
	@Test
	void letAFreePlayerTest() throws ObjectNotFoundException {
		Club club = MainClass.getClub("Dortmund"); 
		Manager manager = new Manager("Maurizio Sarri", club);
		Player burki = club.getPlayers().get(0);		

		manager.LetFreePlayer(burki);

		List<Player> players = manager.getClub().getPlayers(); 
		boolean error = false;
		
		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).equals(burki)) {
				error = true;
			}
		}
		
		Assertions.assertFalse(error);
	}
	
	@Test
	void contractAFreePlayerTest() throws ObjectNotFoundException {
		
		letAFreePlayerTest();
		
		Player player = MainClass.getPlayer("Burki");
		
		Assertions.assertEquals(player.getStatus().toLowerCase(), "sem clube");
	}
 
}

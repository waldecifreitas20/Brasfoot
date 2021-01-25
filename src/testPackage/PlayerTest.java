package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.club.Club;
import classes.club.Player;
import classes.club.Player.Ability;
import classes.club.Player.Position;
import exceptions.ObjectNotFoundException;

class PlayerTest {

	@Test
	void InitAgePlayerErrortest() {
		Player player = new Player("Nicolas", Position.FORWARD, new Ability(0,0,0,0), 15, "Paysandu");
		
		Assertions.assertNotEquals(player.getAge(), 15);
	}
	
	@Test
	void CheckProposalTest() {
		Player player = new Player("Nicolas", Position.FORWARD, new Ability(10,10,0,0), 25, "Paysandu");
		boolean accept;
		try {
			Club barca = MainClass.getClub("Barcelona");
			System.out.println(barca.getPower());
			accept = player.checkProposal(barca);
		} catch (ObjectNotFoundException e) {
			accept = false;
		}
		
		Assertions.assertTrue(accept);
	}

}

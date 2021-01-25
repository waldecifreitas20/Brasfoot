package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.MainClass;
import classes.competitions.SuperChampions;

class SuperChampionsTest {

	@Test
	void LoadRoundtest() {
		var clubs = MainClass.clubsDataBase();
		SuperChampions sc = new SuperChampions(clubs);
		boolean error =  !sc.loadAllRounds();
		
		Assertions.assertFalse(error);
	}

}

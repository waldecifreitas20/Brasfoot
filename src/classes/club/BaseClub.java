package classes.club;

import java.util.List;

public class BaseClub {
	protected String name;
    protected List<Player> players;

    public BaseClub(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

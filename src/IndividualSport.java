import java.util.*;

public class IndividualSport {
	private String sportName;
	private ArrayList <Player> athletes = new ArrayList<>();
	
	public IndividualSport (String name) {
		sportName = name;
	}
	
	public String toString() {
		return "Sport: " + sportName + ", Loaded Athletes: " + athletes;
	}
	
	public String getSportName() {
		return sportName;
	}
	
	public void addAthlete (Player p) {
		athletes.add(p);
	}
	
	public String getRoster() {
		String tempRoster = "Roster:";
		for (int i = 0; i < athletes.size(); i++) {
			Player temp = athletes.get(i);
			if (i + 1 == athletes.size()) {
				tempRoster = tempRoster + " " + temp.getFullName() + ".";
			} else {
				tempRoster = tempRoster + " " + temp.getFullName() + ",";
			}
		}
		return tempRoster;
	}

}

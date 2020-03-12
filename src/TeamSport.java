import java.util.*;

//class that formalizes a virtual team for a sport. A collection of team players. 
//Add -- SportType as string (baseball etc)
//Add -- team name as string
//Add -- teamCity as string
//Add -- max players as integer -- caps the amount of teamPlayers in a array
//Add -- the virtual team as an array list
//function -- add player to the team

public class TeamSport {
	private String sportType;
	private String teamName;
	private String teamCity;
	private int maxAthleteNumber;
	private ArrayList <TeamPlayer> teamMembers = new ArrayList <>();
	
	public TeamSport (String sportType, String teamName, String teamCity, int max) {
		this.sportType = sportType;
		this.teamName = teamName;
		this.teamCity = teamCity;
		maxAthleteNumber = max;
	}
	
	public void addTeamMember (TeamPlayer t) {
		if (teamMembers.size() >= maxAthleteNumber) {
			throw new IllegalArgumentException("Team is full! TeamSport.java/addTeamMember");
		} else {
			teamMembers.add(t);
		}
	}
	public String toString() {
		return "Type: " + sportType + ", Name: " + teamName + ", City: " + teamCity + ", Max Athletes: " + maxAthleteNumber + ", Roster: " + teamMembers;
	}
	
	public String getRoster() {
		String tempRoster = "Roster:";
		for (int i = 0; i < teamMembers.size(); i++) {
			TeamPlayer temp = teamMembers.get(i);
			if (i + 1 == teamMembers.size()) {
				tempRoster = tempRoster + " " + temp.getFullName() + "(" + temp.getPosition() + "), ";
			} else {
				tempRoster = tempRoster + " " + temp.getFullName() + "(" + temp.getPosition() + "). ";
			}
		}
		return tempRoster;
	}
	
	public String getSportType() {
		return sportType;
	}
	public String getTeamName() {
		return teamName;
	}
	public String getTeamCity() {
		return teamCity;
	}
	public int getMaxAthelteNumber() {
		return maxAthleteNumber;
	}
}

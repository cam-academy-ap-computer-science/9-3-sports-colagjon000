
public class TeamPlayer extends Player{
	private int rank;
	private String teamName;
	private String homeCity;
	public TeamPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn, int yearBorn, int rank, String teamName, String homeCity) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn);
		this.rank = rank;
		this.teamName = teamName;
		this.homeCity = homeCity;
	}
	
	public String toString () {
		return super.toString() + ", Rank: " + rank + ", Team: " + teamName + ", City: " + homeCity;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String getTeam () {
		return teamName;
	}
	
	public String getCity() {
		return homeCity;
	}

}

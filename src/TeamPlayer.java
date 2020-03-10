
public class TeamPlayer extends Player{
	private int rank;
	private String teamName;
	private String homeCity;
	public TeamPlayer(int aS, String fN, String lN, String coBo, String coRe, int rank, String teamName, String homeCity) {
		super(aS, fN, lN, coBo, coRe);
		this.rank = rank;
		this.teamName = teamName;
		this.homeCity = homeCity;
	}
	
	public String toString () {
		return super.toString() + ", Rank: " + rank + ", Team: " + teamName + ", City: " + homeCity;
	}

}

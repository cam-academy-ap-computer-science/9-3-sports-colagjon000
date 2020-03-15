
public class TeamPlayer extends Player{
	private int rank;
	private String teamName;
	private String position;
	public TeamPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn, int yearBorn, int rank, String teamName, String position) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn);
		this.rank = rank;
		this.teamName = teamName;
		this.position = position;
	}
	
	public boolean equals (Object o) {
		if (super.equals(o) == true) {
			if (o instanceof TeamPlayer) {
				TeamPlayer temp = (TeamPlayer) o;
				return (this.rank == temp.rank) && (this.teamName.equals(temp.teamName)) && (this.position.equals(temp.position));
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public String toString () {
		return super.toString() + ", Rank: " + rank + ", Team: " + teamName + ", Position" + position;
	}
	
	public int getRank() {
		return rank;
	}
	
	public String getTeam () {
		return teamName;
	}
	
	public String getPosition() {
		return position;
	}

}

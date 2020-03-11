
public class soccerPlayer extends TeamPlayer {

	private String position;
	private int careerGoals;
	public soccerPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn,
			int yearBorn, int rank, String teamName, String homeCity, String position, int careerGoals) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn, rank, teamName, homeCity);
		this.position = position;
		this.careerGoals = careerGoals;
	}
	
	public int getAllGoals() {
		return careerGoals;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return super.toString() + ", Position: " + position + ", Career Goal Count: " + careerGoals;
	}


}

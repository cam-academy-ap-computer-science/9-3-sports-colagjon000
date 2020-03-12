
public class soccerPlayer extends TeamPlayer {

	private int careerGoals;
	public soccerPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn,
			int yearBorn, int rank, String teamName, String position, int careerGoals) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn, rank, teamName, position);
		this.careerGoals = careerGoals;
	}
	
	public int getAllGoals() {
		return careerGoals;
	}
	
	public String toString() {
		return super.toString() + ", Career Goal Count: " + careerGoals;
	}


}

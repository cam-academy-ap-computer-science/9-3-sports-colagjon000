//soccer player class
//similar to baseball but fields are simply career goals and the player number
public class soccerPlayer extends TeamPlayer {

	private int careerGoals;
	private int playerNumber;
	public soccerPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn,
			int yearBorn, int rank, String teamName, String position, int careerGoals, int playerNumber) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn, rank, teamName, position);
		this.careerGoals = careerGoals;
		this.playerNumber = playerNumber;
	}
	
	public boolean equals(Object o) {
		if (super.equals(o) == true) {
			if (o instanceof soccerPlayer) {
				soccerPlayer temp = (soccerPlayer) o;
				return (this.careerGoals == temp.careerGoals) && (this.playerNumber == temp.playerNumber);
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int getAllGoals() {
		return careerGoals;
	}
	
	public void setGoals(int g) {
		careerGoals = g;
	}
	
	public void addGoal() {
		careerGoals++;
	}
	
	public void addGoal(int n) {
		careerGoals += n;
	}
	
	public int getPlayerNumber() {
		return playerNumber;
	}
	
	public void setPlayerNumber(int n) {
		playerNumber = n;
	}
	
	public String toString() {
		return super.toString() + ", Career Goal Count: " + careerGoals;
	}


}

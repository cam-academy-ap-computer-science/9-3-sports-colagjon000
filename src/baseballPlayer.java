//baseball player -- subclass of teamPlayer and player
//adds baseball statistics such as batting average and career runs
//nothing too special

public class baseballPlayer extends TeamPlayer {

	private double batAvg;
	private int careerRuns;
	
	public baseballPlayer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn,
			int yearBorn, int rank, String teamName, String position, double batAvg, int careerRuns) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn, rank, teamName, position);
		this.batAvg = batAvg;
		this.careerRuns = careerRuns;
	}
	
	public boolean equals (Object o) {
		if (super.equals(o) == true) {
			if (o instanceof baseballPlayer) {
				baseballPlayer temp = (baseballPlayer) o;
				return (this.batAvg == temp.batAvg) && (this.careerRuns == temp.careerRuns);
			}
		}
		
		return false;
	}
	
	public String toString() {
		return super.toString() + ", Batting Average: " + batAvg + ", Career Runs: " + careerRuns;
	}
	//getters and setters
	
	public double getBatAvg() {
		return batAvg;
	}
	
	public int getRuns() {
		return careerRuns;
	}
	
	public void setBatAvg (double average) {
		batAvg = average;
	}
	
	public void setCareerRuns (int runs) {
		careerRuns = runs;
	}

}

import java.util.ArrayList;
import java.util.Collections;

//individual athlete -- does not extend from teamPlayer.java
//adds swimming statistics such as stroke, list of bestTimes, and has world record
public class swimmer extends Player{
	private String mainStroke;
	private ArrayList <Time> PRs = new ArrayList<>();
	private boolean hasWorldRecord;

	public swimmer(int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn, int yearBorn, String mainStroke, boolean hasWorldRecord) {
		super(aS, fN, lN, coBo, coRe, monthBorn, dayBorn, yearBorn);
		this.mainStroke = mainStroke;
		this.hasWorldRecord = hasWorldRecord;
	}
	
	public void addPR (Time t) {
		PRs.add(t);
	}

	//return all PR's a Swimmer has, if no added PR's, return "No PRs Added"
	//conditional to see if there is anything added to the list
	//return all array contents if there are contents in order
	public String getPRs() {
		if (PRs.size() == 0) {
			return "No PRs Added. Add a PR to see stats.";
		} else {
			return "All PRs: " + PRs;
		}
	}
	
	public boolean equals (Object o) {
		if (super.equals(o) == true) {
			if (o instanceof swimmer) {
				swimmer s = (swimmer) o;
				return (mainStroke.equals(s.mainStroke) && (hasWorldRecord == s.hasWorldRecord) );
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	//only compares times
	public boolean compareTimes (swimmer s) {
		ArrayList <Time> otherTemp = new ArrayList<>(s.PRs);
		ArrayList <Time> thisTemp = new ArrayList<>(this.PRs);
		Collections.sort(otherTemp, Time.timeByEvent);
		Collections.sort(thisTemp, Time.timeByEvent);
		
		
	}
	
	//TODO print sorted times for testing
	
	public String toString() {
		return super.toString() + ", Main Stroke: " + mainStroke + ", Holds World Record? " + hasWorldRecord;
	}
	
	public String getStroke() {
		return mainStroke;
	}
	
	public boolean getWRStatus() {
		return hasWorldRecord;
	}

}

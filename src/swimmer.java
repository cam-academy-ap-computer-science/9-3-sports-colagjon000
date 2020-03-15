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
	
	//compares all fields and the contents of the arraylist of times. 
	//times can be in different order, just simply checks the contents, and the correlating times the swimmer has
	public boolean equals (Object o) {
		if (super.equals(o) == true) {
			if (o instanceof swimmer) {
				swimmer s = (swimmer) o;
				return (mainStroke.equals(s.mainStroke) && (hasWorldRecord == s.hasWorldRecord) && this.compareTimes(s));
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	//only compares times -- even if the order of the times is different in the array -- used in testing and the equals method, but can be used later
	//sorts times alphabetically by event name, then compares
	//kicks out first if array sizes are different to save 'time'
	public boolean compareTimes (swimmer s) {
		ArrayList <Time> otherTemp = new ArrayList<>(s.PRs);
		ArrayList <Time> thisTemp = new ArrayList<>(this.PRs);
		if (otherTemp.size() != thisTemp.size()) {
			return false;
		}
		
		Collections.sort(otherTemp, Time.timeByEvent);
		Collections.sort(thisTemp, Time.timeByEvent);
		
		for (int i = 0; i < otherTemp.size() - 1; i ++) {
			if (!(otherTemp.get(i).equals(thisTemp.get(i)))) {
				return false;
			}
		}
		
		return true;
	}
	//getters and setters
	
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

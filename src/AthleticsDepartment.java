import java.util.*;
//representing all athletes in a region, both team athletes in teams and individual competing for a region individually
public class AthleticsDepartment {
	private String region;
	private ArrayList <TeamSport> teams = new ArrayList <>();
	private ArrayList <IndividualSport> indiSports = new ArrayList <>();
	
	public AthleticsDepartment (String region) {
		this.region = region;
	}
	
	public void addTeam (TeamSport t) {
		teams.add(t);
	}
	
	public void addIndiSport(IndividualSport i) {
		indiSports.add(i);
	}
	
	public String getRegion() {
		return region;
	}
	

}

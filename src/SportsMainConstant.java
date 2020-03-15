//done for now, all minimums should work
//Most likely will keep editing this slowly to see how i can implement just to make a GUI and experiment with that with input fields and etc...
public class SportsMainConstant {

	public static void main(String[] args) {

		//quick test
		swimmer Nathan = new swimmer(1000000, "Nathan", "Adrian", "United States", "United States", 12, 7, 1988, "Freestyle", false);
		Nathan.addPR(new Time("200 Free", 1, 36, 22));
		Nathan.addPR(new Time("100 Free", 0, 44, 10));
		Nathan.addPR(new Time("50 Free", 0, 19, 01));
		
		swimmer Nathan2 = new swimmer(1000000, "Nathan", "Adrian", "United States", "United States", 12, 7, 1988, "Freestyle", false);
		Nathan2.addPR(new Time("200 Free", 1, 36, 22));
		Nathan2.addPR(new Time("50 Free", 0, 19, 01));
		Nathan2.addPR(new Time("100 Free", 0, 44, 10));
		
		swimmer CalebDressel = new swimmer (1000000, "Caleb", "Dressel", "United States", "United States", 8, 16, 1996, "Freestyle", true);
		CalebDressel.addPR(new Time("50 Free", 0, 17, 63));
		TeamPlayer anotherDressel = new TeamPlayer (100000, "Caleb", "Dressel", "United States", "United States", 8, 16, 1996, 1, "thunder", "free");
		soccerPlayer twoDressel = new soccerPlayer (100000, "Caleb", "Dressel", "United States", "United States", 8, 16, 1996, 1, "thunder", "free", 10, 10);
		
		IndividualSport Swimming = new IndividualSport("Swimming");
		Swimming.addAthlete(Nathan);
		Swimming.addAthlete(CalebDressel);
		
		System.out.println(Nathan.toString());
		System.out.println(Nathan.getPRs());
		System.out.println();
		System.out.println(Swimming.getRoster());
		System.out.println(anotherDressel.equals(twoDressel));
		System.out.println();
		System.out.println(Nathan.getPRs());
		System.out.println(Nathan2.getPRs());
		System.out.println();
		System.out.println("Result " + Nathan.equals(Nathan2));
	}

}

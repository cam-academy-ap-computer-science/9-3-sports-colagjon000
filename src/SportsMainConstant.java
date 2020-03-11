
public class SportsMainConstant {

	public static void main(String[] args) {

		//quick test
		swimmer Nathan = new swimmer(1000000, "Nathan", "Adrian", "United States", "United States", 12, 7, 1988, "Freestyle", true);
		Nathan.addPR(new Time("200 Free", 1, 36, 22));
		Nathan.addPR(new Time("100 Free", 0, 44, 10));
		Nathan.addPR(new Time("50 Free", 0, 19, 01));
		
		System.out.println(Nathan.toString());
		System.out.println(Nathan.getPRs());
	}

}

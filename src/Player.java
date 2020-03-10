import java.time.LocalDate;

public class Player {
	private int age;
	private int averageSalary;
	private String firstName;
	private String lastName;
	private String countryBorn;
	private String countryRepresent;
	private int yearBorn;
	private int monthBorn;
	private int dayBorn;
	LocalDate curDate = LocalDate.now();
	
	public Player (int aS, String fN, String lN, String coBo, String coRe) {
		averageSalary = aS;
		firstName = fN;
		lastName = lN;
		countryBorn = coBo;
		countryRepresent = coRe;
		//getAge
		if (curDate.getMonthValue() > monthBorn) {
			age = curDate.getYear() - yearBorn;
		} else if (curDate.getMonthValue() < monthBorn) {
			age = curDate.getYear() - yearBorn - 1;
		} else if (dayBorn > curDate.getDayOfMonth()) {
			age = curDate.getYear() - yearBorn - 1;
		} else if (dayBorn <= curDate.getDayOfMonth()) {
			age = curDate.getYear() - yearBorn;
		} else {
			throw new IllegalArgumentException("I don't even know what happened: Player.java/Player");
		}
		//make sure age isn't negative
		if (age < 0) {
			throw new IllegalArgumentException("Negative age: Player.java/Player");
		}
		
		
	}
	
	public String toString() {
		return "Age: " + age + ", YearEarnings: " + averageSalary + ", Name: " + firstName + " " + lastName + ", Birthday " + this.birthdayToString() + ", CountryBorn: "
				+ countryBorn + ", Country Representing: " + countryRepresent;
	}
	
	public String birthdayToString () {
		return monthBorn + "/" + dayBorn + "/" + yearBorn;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSalary() {
		return averageSalary;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNativeCountry() {
		return countryBorn;
	}
	
	public String getCountryRepresent()	{
		return countryRepresent;
	}
	
	public int getDayBorn() {
		return dayBorn;
	}
	
	public int getMonthBorn() {
		return monthBorn;
	}
	
	public int getYearBorn() {
		return yearBorn;
	}
}

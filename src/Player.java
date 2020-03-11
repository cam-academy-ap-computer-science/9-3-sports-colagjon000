import java.time.LocalDate;
//Player Class -- Sets age, salary, name, country born and representing, and birthday
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
	
	public Player (int aS, String fN, String lN, String coBo, String coRe, int monthBorn, int dayBorn, int yearBorn) {
		averageSalary = aS;
		firstName = fN;
		lastName = lN;
		countryBorn = coBo;
		countryRepresent = coRe;
		this.monthBorn = monthBorn;
		this.dayBorn = dayBorn;
		this.yearBorn = yearBorn;
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
		return "Name: " + firstName + " " + lastName + " Age: " + age + ", YearEarnings: " + averageSalary + " USD, Birthday " + this.birthdayToString() + ", CountryBorn: "
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

import java.time.LocalDate;
//Player Class -- Sets age, salary, name, country born and representing, and birthday
//Add functionality where age is automatically determined based on current date -- IMPORT java.time
//	- Age -- if past the birth date -- subtract from current year
//		  -- if not past the birth date -- subtract from current year and subtract 1
// 		  -- if months match, compare dates and follow same rule as months.
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
	private LocalDate curDate = LocalDate.now();
	
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
	
	public boolean equals (Object o) {
		if (o instanceof Player) {
			Player other = (Player) o;
			return (age == other.age) && (monthBorn == other.monthBorn) && (dayBorn == other.dayBorn) && (yearBorn == other.yearBorn) && (firstName.equals(other.firstName))
					&& (lastName.equals(other.lastName) && (countryBorn.equals(other.countryBorn)) && (countryRepresent.equals(other.countryRepresent) 
							&& (averageSalary == other.averageSalary)));
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", Age: " + age + ", Year Earnings: " + averageSalary + " USD, Birthday " + this.birthdayToString() + ", Country Born: "
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

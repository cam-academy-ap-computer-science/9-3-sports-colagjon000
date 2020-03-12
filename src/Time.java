//small class to define a swimming time
//set event type, minutes, seconds, and milliseconds
//add constraint so milliseconds is never over 99
//add constraint so seconds is never over 59
//add display functionality where single digits appear to have a 0 in front similar to how swimming times work
//	- however does not change raw value of milliseconds or seconds -- keep original stored in private variables

//Add two constructors as a number of events never reach above a minute -- unnecessary fields
import java.util.*;

public class Time {
	private String event;
	private int minutes;
	private int seconds;
	private int milliseconds;
	public Time (String event, int minutes, int seconds, int milliseconds) {
		this.event = event;
		this.minutes = minutes;
		this.seconds = seconds;
		this.milliseconds = milliseconds;
		if (this.milliseconds >= 100) {
			seconds = seconds + (milliseconds/100);
			milliseconds = milliseconds % 60;
		}
		if (this.seconds >= 60) {
			minutes = minutes + (seconds/60);
			seconds = seconds % 60;
		}
		
	}
	
	public Time (String event, int seconds, int milliseconds) {
		this.event = event;
		minutes = 0;
		this.milliseconds = milliseconds;
		this.seconds = seconds;
		if (this.milliseconds >= 100) {
			seconds = seconds + (milliseconds/100);
			milliseconds = milliseconds % 60;
		}
		if (this.seconds >= 60) {
			minutes = minutes + (seconds/60);
			seconds = seconds % 60;
		}
	}
	//compares contents of Time
	public boolean equals(Object o) {
		if (o instanceof Time) {
			Time t = (Time) o;
			return (event.equals(t.event)) && (minutes == t.minutes) && (seconds == t.seconds) && (milliseconds == t.milliseconds);
		} else {
			return false;
		}
	}
	
	//sorts order of array and compares for only content, not order of events which may have been changed accidentally.
	  public static Comparator <Time> timeByEvent = new Comparator <Time>() {
		  public int compare(Time t1, Time t2) {
			   String timeEvent1 = t1.getEvent().toUpperCase();
			   String timeEvent2 = t2.getEvent().toUpperCase();

			   return timeEvent1.compareTo(timeEvent2);
		  }
		  
	  };
	
	public String toString() {
		//change seconds and milliseconds into a string so 0 can be placed in front of the integer without being parsed out
		String secondsString;
		String milliString;
		
		if (seconds < 10) {
			secondsString = "0" + seconds;
		} else {
			secondsString = Integer.toString(seconds);
		}
		if (milliseconds < 10) {
			milliString = "0" + milliseconds;
		} else {
			milliString = Integer.toString(milliseconds);
		}
		if (minutes == 0) {
			return event + ": " + secondsString + "." + milliString;
		} else {
			return event + ": " + minutes + ":" + secondsString + "." + milliString;
		}
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMilliseconds() {
		return milliseconds;
	}
	public String getEvent() {
		return event;
	}

}

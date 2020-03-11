//small class to define a swimming time
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

}

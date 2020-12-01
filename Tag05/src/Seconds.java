import java.util.Scanner;

/**
 * Daniel Schirmer
 *
 * 01.12.2020
 * Project : Tag05
 * ©2020
 *
 */

public class Seconds {
	public long days;
	public long hours;
	public long minutes;
	public long seconds;
	private Scanner sc;
	public long secondRest;
	
	public long getDays() {
		return days;
	}
	public void setDays(long days) {
		this.days = days;
	}
	public long getHours() {
		return hours;
	}
	public void setHours(long hours) {
		this.hours = hours;
	}
	public long getMinutes() {
		return minutes;
	}
	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}
	public long getSeconds() {
		return seconds;
	}
	public void setSeconds(long seconds) {
		this.seconds = seconds;
	}
	
	public Seconds() {
		this.days = 0;
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.sc = new Scanner(System.in);
	}
	
	public void inputSeconds() {
		System.out.println("Bitte Sekunden eingeben:");
		this.seconds = this.sc.nextLong();
		this.sc.close();
	}
	
	public void calculateDaysHoursMinutes() {
		this.days = this.seconds/86400;
		this.hours = (this.seconds%86400)/3600;
		this.minutes = ((this.seconds%86400)%3600)/60;
		this.secondRest = ((this.seconds%86400)%3600)%60;
	}
	
	public String toString() {
		return this.seconds + " Sekunden sind " + this.days + " Tag(e), " + this.hours + " Stunde(n), " + this.minutes + " Minute(n), " + this.secondRest + " Sekunden";
	}
}

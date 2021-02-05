import java.util.StringTokenizer;
import java.util.Calendar;


public class Date {
	private int year;
	private int month;
	private int day;
	private static final int MINYEAR = 1900;
	
	public Date(String date) {	//taking mm/dd/yyyy and create a Date object
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		this.month = Integer.parseInt(tokenizer.nextToken());
		this.day   = Integer.parseInt(tokenizer.nextToken());
		this.year  = Integer.parseInt(tokenizer.nextToken());	
		
	} 
	
	
	public Date() { 
		Calendar today = Calendar.getInstance();
		this.month = today.get(Calendar.MONTH);
		this.day   = today.get(Calendar.DATE);
		this.year  = today.get(Calendar.YEAR);
		
	} //create an object with today’s date (see Calendar class)
	
	
	public boolean isValid() { 
		if (this.day < 1) {
			return false;
		}
		
		
		if (this.month < MINYEAR) {
			return false;		
		}
		
		Date today = new Date();
		if (this.year > today.year) {
			return false;
		}
		else if (this.year == today.year) {
			if (today.month > today.month ) {
				return false;
			}
			else if (this.month == today.month) {
				if (this.day > today.day) {
					return false;
				}
			}
		}
	
		
		return true;
		
		
	}
	
	
	
	/*
	@Override
	public boolean equals(Object obj){ }
	*/
	@Override
	
	public String toString() { 
		//make this prettier
		return String.valueOf(this.month+1) + " " + String.valueOf(this.day) + " " + String.valueOf(this.year);
	}
	
	
	
	
}

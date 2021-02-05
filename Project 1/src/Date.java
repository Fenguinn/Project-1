import java.util.StringTokenizer;
import java.util.Calendar;


public class Date {
	private int year;
	private int month;
	private int day;
	private static final int MINYEAR = 1900;
	private static  boolean leapYearCheck = false;
	private static final int QUARTER  = 4, CENTURY = 100, QUADRICENTENNIAL = 400;
	
	
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
			if (this.month > today.month ) {
				return false;
			}
			else if (this.month == today.month) {
				if (this.day > today.day) {
					return false;
				}
			}
		}
		
		
		if (this.month == Months.JANUARY) {
			if (this.day > Months.MaxDaysPerMonth(Months.JANUARY, leapYearCheck)) {
				return false;
			}
		}
		
		else if (this.month == Months.FEBRUARY) {
			
			leapYearCheck = checkForLeapYear(this.year);
			if (this.day > Months.MaxDaysPerMonth(Months.FEBRUARY, leapYearCheck)) {
				return false;
			}
			
		}
		
		
		else if (this.month == Months.MARCH) {
			if (this.day > Months.MaxDaysPerMonth(Months.MARCH, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.APRIL) {
			if (this.day > Months.MaxDaysPerMonth(Months.APRIL, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.MAY) {
			if (this.day > Months.MaxDaysPerMonth(Months.MAY, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.JUNE) {
			if (this.day > Months.MaxDaysPerMonth(Months.JUNE, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.JULY) {
			if (this.day > Months.MaxDaysPerMonth(Months.JULY, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.AUGUST) {
			if (this.day > Months.MaxDaysPerMonth(Months.AUGUST, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.SEPTEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.SEPTEMBER, leapYearCheck)) {
				return false;
			}
			
		}
		else if (this.month == Months.OCTOBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.OCTOBER, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.NOVEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.NOVEMBER, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.DECEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.DECEMBER, leapYearCheck)) {
				return false;
			}
		}
		return true;
		
		
	}
	
	
	
	private boolean checkForLeapYear(int bookYear) {
		if (bookYear % QUARTER == 0 ) {
			if(bookYear % CENTURY == 0) {
				if (bookYear % QUADRICENTENNIAL == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else { 
				return true;
			}
		}
	
		
		return false;
	}
	
	
	
	/*
	@Override
	public boolean equals(Object obj){ }
	*/
	@Override
	
	public String toString() { 
		//make this prettier
		return String.valueOf(this.month+1) + "/" + String.valueOf(this.day) + "/" + String.valueOf(this.year);
	}
	
	
	
	
}

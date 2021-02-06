import java.util.StringTokenizer;
import java.util.Calendar;


public class Date {
	private int year;
	private int month;
	private int day;
	private static final int MINYEAR = 1900;
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
		
		
		if (this.year < MINYEAR) {
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
			if (this.day > Months.MaxDaysPerMonth(Months.JANUARY)) {
				return false;
			}
		}
		
		else if (this.month == Months.FEBRUARY) {
			
			boolean leapYearCheck = checkForLeapYear(this.year);
			if (this.day > Months.MaxDaysPerMonth(Months.FEBRUARY, leapYearCheck)) {
				return false;
			}
		}
		else if (this.month == Months.MARCH) {
			if (this.day > Months.MaxDaysPerMonth(Months.MARCH)) {
				return false;
			}
		}
		else if (this.month == Months.APRIL) {
			if (this.day > Months.MaxDaysPerMonth(Months.APRIL)) {
				return false;
			}
		}
		else if (this.month == Months.MAY) {
			if (this.day > Months.MaxDaysPerMonth(Months.MAY)) {
				return false;
			}
		}
		else if (this.month == Months.JUNE) {
			if (this.day > Months.MaxDaysPerMonth(Months.JUNE)) {
				return false;
			}
		}
		else if (this.month == Months.JULY) {
			if (this.day > Months.MaxDaysPerMonth(Months.JULY)) {
				return false;
			}
		}
		else if (this.month == Months.AUGUST) {
			if (this.day > Months.MaxDaysPerMonth(Months.AUGUST)) {
				return false;
			}
		}
		else if (this.month == Months.SEPTEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.SEPTEMBER)) {
				return false;
			}
			
		}
		else if (this.month == Months.OCTOBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.OCTOBER)) {
				return false;
			}
		}
		else if (this.month == Months.NOVEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.NOVEMBER)) {
				return false;
			}
		}
		else if (this.month == Months.DECEMBER) {
			if (this.day > Months.MaxDaysPerMonth(Months.DECEMBER)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isOlderThan(Date other) {
		if (this.year > other.year) {
			return false;
		}
		else if (this.year == other.year) {
			if (this.month > other.month ) {
				return false;
			}
			else if (this.month == other.month) {
				if (this.day > other.day) {
					return false;
				}
			}
		}
		if (this.equals(other)) {
			return false;
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
	
	
	
	
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		else if (obj instanceof Date){
			Date other = (Date)obj;
			if (this.day == other.day && this.month == other.month && this.year == other.year)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() { 
		//make this prettier
		return String.valueOf(this.month) + "/" + String.valueOf(this.day) + "/" + String.valueOf(this.year);
	}
	
	
	
	
}

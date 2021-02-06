import java.util.StringTokenizer;
import java.util.Calendar;


public class Date {
	private int year;
	private int month;
	private int day;
	private static final int MINYEAR = 1900;
	private static final int QUARTER  = 4, CENTURY = 100, QUADRICENTENNIAL = 400;
	private static final int MAXMONTH = 12, MINMONTH = 1;
	
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
	
	
	
	public static void main(String[] args) {
		boolean valid;
		
		//Invalid days
		System.out.println("Now testing Invalid days (should all be false):");
		
		System.out.println("Testing 1/40/2015...");
		Date date = new Date("1/40/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		System.out.println("Testing 1/0/2015...");
		date = new Date("1/0/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		
		
		//Invalid Months
		System.out.println("Now testing Invalid months (should all be false):");
		
		System.out.println("Testing 0/15/2015...");
		date = new Date("0/15/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		System.out.println("Testing -1/15/2015...");
		date = new Date("-1/15/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		System.out.println("Testing 13/15/2015...");
		date = new Date("13/15/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		System.out.println("Testing 5/15/2021...");
		date = new Date("5/15/2021");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		//Invalid years
		System.out.println("Now testing Invalid years (should all be false):");
		System.out.println("Testing 3/15/2022...");
		date = new Date("3/15/2022");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		System.out.println("Testing 3/15/1899...");
		date = new Date("3/15/1899");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		System.out.println("Testing 3/15/-2020...");
		date = new Date("3/15/-2020");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		
		//Invalid days per Month (1 more than max)
		System.out.println("Now testing Invalid days per Month (should all be false):");
		System.out.println("Testing 3/32/2015...");
		date = new Date("3/32/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		
		System.out.println("Testing 4/31/2015...");
		date = new Date("4/31/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		
		System.out.println("Testing 2/30/2015...");
		date = new Date("2/30/2015");
		valid = date.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		
		//Valid days per Month
		System.out.println("Now testing VALID days per month (should all be true):");
		System.out.println("Testing 3/31/2015...");
		date = new Date("3/31/2015");
		valid = date.isValid();
		 
		if (valid) {
			System.out.println("Test Case#1 is valid and it returned true. PASSED!");
		} 
		else {
			System.out.println("Test Case#1 is valid, (returned false). FAILED!");
		}
		
		
		
		System.out.println("Testing 4/30/2015...");
		date = new Date("4/30/2015");
		valid = date.isValid();
		
		 
		if (valid) {
			System.out.println("Test Case#1 is valid and it returned true. PASSED!");
		} 
		else {
			System.out.println("Test Case#1 is valid, (returned false). FAILED!");
		}
		
		
		System.out.println("Testing 2/28/2015...");
		date = new Date("2/28/2015");
		valid = date.isValid();
		
		 
		if (valid) {
			System.out.println("Test Case#1 is valid and it returned true. PASSED!");
		} 
		else {
			System.out.println("Test Case#1 is valid, (returned false). FAILED!");
		}
		
		
		//Day after today 
		System.out.println("Now Testing the day after today. Should return false:");
		Date tomorrow = new Date();
		tomorrow.day++;
		
		valid = tomorrow.isValid();
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, but it returned true. FAILED!");
		}
		
		
		//Today
		System.out.println("Now testing today. Should return true:");
		Date today = new Date();
		valid = today.isValid();
		
		if (!valid) {
			System.out.println("Test Case#1 is valid (returned false). FAILED!");
		}
		else {
			System.out.println("Test Case#1 is valid, and it returned true. PASSED!");
		}
		
		
		
		//Leap Year 
		System.out.println("Now testing leap year. should return true:");
		System.out.println("Now testing 2/29/2008...");
		Date leapYear = new Date("2/29/2008");
		valid = leapYear.isValid();
		if (!valid) {
			System.out.println("Test Case#1 is valid (returned false). FAILED!");
		}
		else {
			System.out.println("Test Case#1 is valid, and it returned true. PASSED!");
		}
		
		
		//Not a leap year
		System.out.println("Now testing a normal year. should return false:");
		System.out.println("Now testing 2/29/2009...");
		Date notLeapYear = new Date("2/29/2009");
		valid = notLeapYear.isValid();
		if (!valid) {
			System.out.println("Test Case#1 is not valid (returned false). PASSED!");
		}
		else {
			System.out.println("Test Case#1 is not valid, and it returned true. FAILED!");
		}
		
		
		
		
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
	
	
	
	public boolean isValid() { 
		if (this.day < 1) {
			return false;
		}
		
		
		if (this.year < MINYEAR) {
			return false;		
		}
		
		if (this.month > MAXMONTH) {
			return false;
		}
		else if (this.month<MINMONTH) {
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

import java.util.StringTokenizer;
import java.util.Calendar;


public class Date {
	private int year;
	private int month;
	private int day;
	public Date(String date) {	//taking mm/dd/yyyy and create a Date object
		StringTokenizer tokenizer = new StringTokenizer(date, "/");
		this.month = Integer.parseInt(tokenizer.nextToken());
		this.day   = Integer.parseInt(tokenizer.nextToken());
		this.year  = Integer.parseInt(tokenizer.nextToken());	
		
	} 
	/*
	public void main(String[] args) {
		Date date = new Date();
		System.out.println(this.month);
		System.out.println(this.day);
		System.out.println(this.year);
	}
	*/
	
	public Date() { 
		Calendar today = Calendar.getInstance();
		this.month = today.get(Calendar.MONTH);
		this.day   = today.get(Calendar.DATE);
		this.year  = today.get(Calendar.YEAR);
		
	} //create an object with today’s date (see Calendar class)
	
	
	//public boolean isValid() { }
	
	/*
	@Override
	public boolean equals(Object obj){ }
	*/
	@Override
	
	public String toString() { 
		//make this prettier
		return String.valueOf(this.month) + String.valueOf(this.day) + String.valueOf(this.year);
	}
	
	
	
	
}

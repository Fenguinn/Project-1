
public class Book {
	private String number; //a 5-digit serial number unique to the book
	private String name;
	private boolean checkedOut; //set to true if the book has been checked out
	private Date datePublished;
	private static int availSerial = 10001;
	
	public Book(String bookName, String publishDate) {
		this.number = String.valueOf(availSerial);
		this.checkedOut = false;
		this.name   = bookName;
		Date date = new Date(publishDate);
		
		/*This should be called in Library.java
		if (!date.isValid()) {
			THIS HAS TO BE A PRINT "Invalid Date!"
			return;
		}*/
		
		this.datePublished = date;
		availSerial +=1;
		
	}
	
	
	/*
	@Override
	public boolean equals(Object obj){ }
	@Override
	public String toString() { }
	*/
}

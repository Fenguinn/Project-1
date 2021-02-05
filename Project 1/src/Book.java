
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
	
	
	
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		else if (obj instanceof Book){
			Book other = (Book)obj;
			if (this.number == other.number)
				return true;
		}
		return false;
	}
	 
	
	
	public boolean checkOut() {
	//	if (this.checkedOut == false) {
			this.checkedOut = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	public boolean isCheckedOut () {
		if (this.checkedOut == false) 
			return false;
		else 
			return true;
	}
	
	
	
	public boolean returnBook () {
		if (this.checkedOut == true)
			this.checkedOut = false;
	}
	
	
	@Override
	public String toString() {
		return "Book#" + this.number + "::" + this.name + "::" + this.datePublished + "::is available.";
	}
	
}

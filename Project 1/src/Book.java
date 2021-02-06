
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
		this.datePublished = date;
		availSerial +=1;
	}
	
	public Book(String serialNumber) {
		this.number = serialNumber;
		this.name = null;
		this.checkedOut = false;
		this.datePublished = null;
	}
	
	public boolean isCheckedOut () {
		if (this.checkedOut == false) 
			return false;
		else 
			return true;
	}
	
	public Date getDate() {
		return this.datePublished;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void checkOut() {
		if (this.checkedOut == false)
			this.checkedOut = true;
	}
	
	public void returnBook () {
		if (this.checkedOut == true)
			this.checkedOut = false;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
			return false;
		}
		else if (obj instanceof Book){
			Book other = (Book)obj;
			if (this.number.equals(other.number))
				return true;
		}
		return false;
	}
	@Override
	public String toString() {
		if (this.isCheckedOut()) {
			return "Book#" + this.number + "::" + this.name + "::" + this.datePublished + "::is checked out.";
		}
		else{
			return "Book#" + this.number + "::" + this.name + "::" + this.datePublished + "::is available.";
		}
	}
	
}

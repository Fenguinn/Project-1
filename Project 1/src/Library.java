
public class Library {
	private Book[] books; // array-based implementation of the bag data structure
	private int numBooks; // the number of books currently in the bag
	private static int arrSize = 4;
	private static int four = 4; //rename?
	private static int firstOpenSlot = 0;
	private static final int NOTFOUND = -1;
	
	public Library() {
		books = new Book[arrSize];
	} //default constructor to create an empty bag
	
	
	
	private int find(Book book) {
		for (int i=0; i<books.length; i++) {
			if ( books[i].equals(book) ) {
				return i;
			}
		}
		return NOTFOUND;
	} // helper method to find a book in the bag
	
	
	
	private void grow() {
		Book[] booksClone;
		booksClone = new Book[arrSize];
		
		for (int i=0; i<books.length; i++) {
			booksClone[i] = books[i];
		}
		
		books = new Book[arrSize+four];
		
		for (int i=0; i<books.length; i++) {
			books[i] = booksClone[i];
		}
		
		
	} // helper method to grow the capacity by 4
	
	
	
	public void add(Book book) {
		books[firstOpenSlot] = book;
		firstOpenSlot++;
	}
	
	public boolean remove(Book book) {
		int bookToBeRemoved = find(book);
		if (bookToBeRemoved == NOTFOUND) {
			return false;
		}
		books[bookToBeRemoved] = null;
		return true;
	}
	
	
	public boolean checkOut(Book book) { 
		int bookToBeCheckedOut = find(book);
		if (bookToBeCheckedOut == NOTFOUND) {
			return false;
		}
	
		if (books[bookToBeCheckedOut].checkOut() == true) {
			return true;
		}
		return false;
	}//true if checking out is successful
	
	
	
	public boolean returns(Book book) { 
		int bookToBeCheckedOut = find(book);
		if (bookToBeCheckedOut == NOTFOUND) {
			return false;
		}
	
		if (books[bookToBeCheckedOut].isCheckedOut() == false) {
			return false;
		}
		else {
			books[bookToBeCheckedOut].returnBook();
			return true;
		}
	}
	/*public void print() { } //print the list of books in the bag
	public void printByDate() { } //print the list of books by datePublished (ascending)
	public void printByNumber() { } //print the list of books by number (ascending)
	*/
}

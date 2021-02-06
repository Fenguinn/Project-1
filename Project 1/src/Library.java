
public class Library {
	private Book[] books; // array-based implementation of the bag data structure
	private int numBooks; // the number of books currently in the bag
	private static final int FOUR = 4; //rename?
	private static final int NOTFOUND = -1;
	
	public Library() {
		books = new Book[FOUR];
		numBooks = 0;
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
		booksClone = new Book[books.length];
		
		for (int i=0; i<books.length; i++) {
			booksClone[i] = books[i];
		}
		
		books = new Book[books.length+FOUR];
		
		for (int i=0; i<booksClone.length; i++) {
			books[i] = booksClone[i];
		}
		
		
	} // helper method to grow the capacity by 4
	
	private int firstOpenSlot() {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				return i;
			}
		}
		return NOTFOUND;
	}
	
	private void shiftUp(int empytySlot) {
		for (int i = empytySlot; i < books.length-1; i++) {
			books[i] = books[i+1];
			books[i+1] = null;
		}
	}
	
	private void sortByDate() {
		int oldestBookIndex;
		int tempIndex;
		for (int i = 0; i < numBooks -1; i++){
			oldestBookIndex = i;
			for (int j = i+1; j < numBooks; j++) {
				if (books[j].getDate().isOlderThan(books[oldestBookIndex].getDate())) {
					oldestBookIndex = j;
				}
				else if (books[j].getDate().equals(books[oldestBookIndex].getDate())) {
					if (books[j].getName().compareTo(books[oldestBookIndex].getName()) < 0) {
						oldestBookIndex = j;
					}
				}
			}
			Book tempBookPointer = books[i];
			books[i] = books[oldestBookIndex];
			books[oldestBookIndex] = tempBookPointer;
		}
	}

	private void sortByNumber() {
		int smallestNumberIndex;
		int tempIndex;
		for (int i = 0; i < numBooks -1; i++){
			smallestNumberIndex = i;
			for (int j = i+1; j < numBooks; j++) {
				if (books[j].getNumber().compareTo(books[smallestNumberIndex].getNumber()) < 0) {
					smallestNumberIndex = j;
				}
			}
			Book tempBookPointer = books[i];
			books[i] = books[smallestNumberIndex];
			books[smallestNumberIndex] = tempBookPointer;
		}
	}

	
	
	public void add(Book book) {
		int firstOpenSlot = this.firstOpenSlot();
		if (firstOpenSlot != NOTFOUND) {
			books[firstOpenSlot] = book;
		}
		else {
			this.grow();
			firstOpenSlot = this.firstOpenSlot();
			books[firstOpenSlot] = book;
		}
		numBooks++;
	}
	
	public boolean remove(Book book) {
		int bookToBeRemoved = find(book);
		if (bookToBeRemoved == NOTFOUND) {
			return false;
		}
		books[bookToBeRemoved] = null;
		this.shiftUp(bookToBeRemoved);
		numBooks -= 1;
		return true;
	}
	
	
	public boolean checkOut(Book book) { 
		int bookToBeCheckedOut = find(book);
		if (bookToBeCheckedOut == NOTFOUND) {
			return false;
		}
		if (books[bookToBeCheckedOut].isCheckedOut() == true) {
			return false;
		}
		else {
			books[bookToBeCheckedOut].checkOut();
			return true;
		}
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
	
	
	public void print() {
		for (int i = 0; i < numBooks; i++) {
			if (books[i] != null && !books[i].isCheckedOut()) {
				System.out.println(books[i].toString());
			}
		}
	} //print the list of books in the bag
	
	public void printByDate() {
		this.sortByDate();
		this.print();
	} //print the list of books by datePublished (ascending)
	
	 public void printByNumber() { 
		 this.sortByNumber();
		 this.print();
	 } //print the list of books by number (ascending)
}

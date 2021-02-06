import java.util.Scanner;
import java.util.StringTokenizer;
public class Kiosk {

	//...
	private static final int FIRSTINDEX = 0;
	private static final int SECONDINDEX = 1;
	private static final int THIRDINDEX = 2;
	private static final int MAXINPUTS = 3;
	
	public void run() {
		String command;
		String bookName;
		String date;
		String line;
		boolean Quit = false;
		
		System.out.println("Library Kiosk running.");
		Library library = new Library();
		Scanner input = new Scanner(System.in);
		StringTokenizer tokens;
		String tokensArray[];
		
		while(!Quit){
			line = input.nextLine();
			tokens = new StringTokenizer(line, ",");
			tokensArray = this.tokenizedInput(tokens);
//			command = tokensArray[0];
//			bookName = tokensArray[1];
//			date = tokensArray[2];
			
			
			
			
			switch(tokensArray[FIRSTINDEX]) 
			{
				case "A":
					Date bookToAddDate = new Date(tokensArray[THIRDINDEX]);
					if (bookToAddDate.isValid()) {
						Book bookToAdd = new Book(tokensArray[SECONDINDEX],tokensArray[THIRDINDEX]);
						library.add(bookToAdd);
						System.out.println(tokensArray[SECONDINDEX] + " added to the Library.");
					}
					else {
						System.out.println("Invalid Date!");
					}
					break;
				case "R":
					Book bookToBeRemoved = new Book(tokensArray[SECONDINDEX]);
					if (library.remove(bookToBeRemoved)){
						System.out.println("Book#" + tokensArray[SECONDINDEX] + " removed.");
					}
					else{
						System.out.println("Unable to remove, the library does not have this book.");
					}
					break;
				case "O":
					Book bookToBeCheckedOut = new Book(tokensArray[SECONDINDEX]);
					if (library.checkOut(bookToBeCheckedOut)){
						System.out.println("You've checked out Book#" + tokensArray[SECONDINDEX] + ". Enjoy!");
					}
					else {
						System.out.println("Book#" + tokensArray[SECONDINDEX] + " is not available.");
					}
					break;
				case "I":
					Book bookToBeReturned = new Book(tokensArray[SECONDINDEX]);
					if (library.returns(bookToBeReturned)){
						System.out.println("Book#" + tokensArray[SECONDINDEX] + " return has completed. Thanks!");
					}
					else {
						System.out.println("Unable to return Book#" + tokensArray[SECONDINDEX] + ".");
					}
					break;
				case "PA":
					System.out.println("**List of books in the library.");
					library.print();
					System.out.println("**End of list");
					break;
				case "PD":
					System.out.println("**List of books by the dates published.");
					library.printByDate();
					System.out.println("**End of list");
					break;
				case "PN":
					System.out.println("**List of books by the book numbers.");
					library.printByNumber();
					System.out.println("**End of list");
					break;
				case "Q":
					Quit = true;
					break;
				default:
					System.out.println("Invalid command!");
					break;
			}
		}
		
		input.close();
		System.out.println("Kiosk session ended.");
	}
	
	
	
	
	private String[] tokenizedInput(StringTokenizer token) {
		String tokens[] = new String[MAXINPUTS];
		for (int i=0; i<MAXINPUTS; i++) {
			if (token.hasMoreTokens()) {
				tokens[i] = token.nextToken();
			}
		}
		return tokens;
	}
	
	
}

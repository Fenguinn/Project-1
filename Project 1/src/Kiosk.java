import java.util.Scanner;
import java.util.StringTokenizer;
public class Kiosk {

	//...
	private static final int MAXINPUTS = 3;
	public void run() {
		String command;
		String bookName;
		String date;
		String line;
		
		System.out.println("Library Kiosk running.");
		
		Scanner input = new Scanner(System.in);
		line = input.nextLine();
		
		
		StringTokenizer tokens = new StringTokenizer(line, ",");
		command = tokens.nextToken();
		bookName = tokens.nextToken();
		date = tokens.nextToken();
		
		
		
		
		
		
		System.out.println("Kiosk session ended.");
	}
	
	
	
	
	private void tokenizedInput(StringTokenizer token) {
		String tokens[] = new String[3];
		
		for (int i=0; i<MAXINPUTS; i++) {
			if (token.hasMoreTokens()) {
				tokens[i] = token.nextToken();
			}
		}
		
		
		
	}
	
	
}



public class RunProject1 {
	//public static void main(String[] args) {
		//new Kiosk().run();
//	}
	
	public static void main(String[] args) {
		//Date date = new Date();
		
		Book book = new Book("Nice Test", "01/15/1950");
		System.out.println(book.getName());
		System.out.println(book.getNumber());
		System.out.println(book.getDate());
		
		book.checkOut();
		
		System.out.println(book.isCheckedOut());
		
		book.returnBook();
		System.out.println(book.isCheckedOut());
		
		System.out.println(book.equals(book));
		System.out.println(book.toString());
		
		
		Date date = new Date("2/15/2008");
		Date date2 = new Date("2/29/2009");
		
		System.out.println(date2.isOlderThan(date));
		
		
		
		
	
		System.out.println(date.toString());
		System.out.println(date2.toString());
		System.out.println(date.isValid());
		System.out.println(date2.isValid());
		
		
		
		System.out.println(date.equals(date2));
		System.out.println(date.equals(date));
		
	}
	
	
	
}

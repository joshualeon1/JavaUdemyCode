//	06.01.2021
//	Testing 'Printer' class

public class EncapsulationChallenge {

	public static void main(String[] args) {

		Printer printer = new Printer(50, false);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed: " + pagesPrinted + "\nNew Total print count for printer: " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed: " + pagesPrinted + "\nNew Total print count for printer: " + printer.getPagesPrinted());
		
		//We did basically what was asked, but in the video, his method was quite different so instructions given could have been described insufficiently.
		
	}//end main

}//end class

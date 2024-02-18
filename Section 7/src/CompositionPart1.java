//	05.18.2021
public class CompositionPart1 {

	public static void main(String[] args) {

		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		//Below we use 'public' Getter methods in the 'PC' class, in CompositionPart2 we change them to 'private'
		/*
		thePC.getMonitor().drawlPixelAt(1500, 1200, "red");//this is how we access the 'drawPixelAt' method by accessing the 'Monitor' class that is used within the 'PC' class
		thePC.getMotherboard().loadProgram("Windows 1.0");//this same thing as the previous line but another example
		thePC.getTheCase().pressPower();//Yet another example as the previous two
		*/
		
		//Composition Part 2 Below:
		thePC.powerUp();
		
	}//end main

}//end class

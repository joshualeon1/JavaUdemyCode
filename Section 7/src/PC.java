//	05.18.2021

public class PC {

	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	//Constructor
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	//Methods
	public void powerUp() {
		theCase.pressPower();	//Here instead of using getter methods, we access what is stored in the variable directly. Here we have 'theCase' as an example
		drawLogo();
	}
	
	private void drawLogo() {
		//Fancy graphics
		monitor.drawlPixelAt(1200, 50, "yellow");
	}
	
	//Getters
	/*
	private Case getTheCase() {
		return theCase;
	}

	private Monitor getMonitor() {
		return monitor;
	}

	private Motherboard getMotherboard() {
		return motherboard;
	}
	*/
	
}//end constructor

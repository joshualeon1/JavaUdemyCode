//	05.18.2021

public class Monitor {

	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	//Constructor
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	//Method
	public void drawlPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
	}

	//Getters and Setters Below:
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public void setNativeResolution(Resolution nativeResolution) {
		this.nativeResolution = nativeResolution;
	}
	
}//end class

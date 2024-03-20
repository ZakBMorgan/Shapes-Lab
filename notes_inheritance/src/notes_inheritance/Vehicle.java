package notes_inheritance;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("from Vehicle Constructor");
	}
	
	//override toString so we can print the object
	//using its properties in a human-readable form
	public String toString() {
		
		return make + " : " + model + " : " + year;
		
	}
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void getYear(int year) {
		this.year = year;
	}
	public void setYear(int year) {
		
	}
	
	//other methods aka "behaviors" of the class
	public void forward(int amount) {
		
	}
	public void backward(int amount) {
		
	}
	public void turnLeft() {
	
	}
	public void turnRight() {
	
	}

	

}

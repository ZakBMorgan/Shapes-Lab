package notes_inheritance;

//establish an is-a relationship w/ Vehicle
//via the extends keyword
public class Car extends Vehicle {
	
	private int numWheels;
	private int numDoors;
	//add a constructor in Car that takes in
	//the make, model, and year
	public Car(String make, String model, int year) {
		
		//pass the info to the superclass constructor
		//to set the properties
		super(make, model, year);
		
		numWheels = 4;
		numDoors = 2;
		
	}

	//car needs to be able to print its additional properties!
	public String toString() {
		
		//hybrid! it prints its properties then call
		//parent method for the other stuff
		return "wheels: " + numWheels + " doors: " + numDoors + " - " + super.toString(); //explicitly calls parent toString
		
		
	}
	
}

package notes_inheritance;

public class Driver {

	public static void main(String[] args) {
		
		//unit 2!
		//create the objects
		Vehicle v = new Vehicle("Generic", "model", 1);
		
		Car myCar = new Car("Tesla", "Roadster", 2026);
		
		Boat myBoat = new Boat("Sunseker", "90 Ocean", 2022);
		
		System.out.println(v);
		
		//because myCar is a Vehicle, it INHERITS the public
		//toString method so it follow those instructions
		//for printing
		System.out.println(myCar);
		
		//Create a GUI object
		GUI gui = new GUI(800, 600);

	}

}

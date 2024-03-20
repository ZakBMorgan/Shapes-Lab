package notes_inheritance;

public class Rectangle extends Shape{
	
	//a Rectangle has a width and length
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		
		super(x, y); //call to super const must always happen first
		this.width = width;
		this.height = height;
		
		
	}
	
}

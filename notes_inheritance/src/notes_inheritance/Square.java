package notes_inheritance;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Rectangle{
	
	public Square(int x, int y, int size) {
		
		//width and height will be set to
		//the same value (size) hence making it
		//a square
		super(x, y, size, size);
	}
	
	public void draw(Graphics g) { //<-- import Graphics
		
		g.setColor(Color.blue); // or w/e color dif from background
		
		//child classes (subclasses) have access to PROTECTED members
		//here, square can use the 4 attributes from the super classes
		//w/o using getters!!! all because a Square is a Rectangle which is a Shape
		g.drawRect(x, y, width, height);
	}
}

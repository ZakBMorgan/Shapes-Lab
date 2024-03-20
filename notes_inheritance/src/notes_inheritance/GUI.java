package notes_inheritance;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel{
	
	private int width = 800;
	private int height = 600;
	
	public Square mySquare = new Square(50, 50, 150); //x, y, size
	
	//extending JPanel allows us to override Paint
	public void paint(Graphics g) {
		
		//force refresh the panel
		super.paintComponent(g);
		mySquare.draw(g);
		
	}
	
	public GUI(int w, int h) {
		
		this.width = w;
		this.height = h;
		
		JFrame frame = new JFrame("Drawing GUI"); //<-- import JFrame
		frame.setSize(this.width, this.height);
		
		//add this panel to the JFrame
		frame.add(this);
		
		//sets x button for JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
}

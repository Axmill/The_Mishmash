package cats;

import java.awt.*;
import javax.swing.*;

public class WikiWiki extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("I AM SIR STRING, THE NOBLE!",25,25);
		g.drawString("Hey, Man!",25,40);
		g.drawString("The cat says 'Meow'.",25,55);
	}
}

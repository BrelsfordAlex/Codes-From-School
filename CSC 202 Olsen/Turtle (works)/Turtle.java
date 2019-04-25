// <pre>
/*  Copy this file in its entirety to a file named Turtle.java.
 *  Compile the Turtlet class and then compile this class, before trying to 
 *  compile any program that uses Turtles.
 *  This class draws to an Image object and lets the frame's paint method 
 *  show the Image whenever the frame repaints itself. It is for 
 *  Turtle commands that are given in or from a main application. */

import java.awt.*;

public class Turtle extends Turtlet
{
	private static TurtleWorld theWorld = null;


	/** Write words without changing the Turtle's state.  */

	public void say (String message)
	{	super.say (message);
		theWorld.repaint();
	}	//======================


	/** Make a circle of the given radius, Turtle at center. */

	public void swingAround (double radius)
	{	super.swingAround (radius);
		theWorld.repaint();
	}	//======================


	/** Fill a circle of the given radius, Turtle at center. */

	public void fillCircle (double radius)
	{	super.fillCircle (radius);
		theWorld.repaint();
	}	//======================


	/** Rotate left by left degrees; MOVE for forward steps.*/

	public Turtlet move (double left, double forward)
	{	return super.move (left, forward);
	}	//======================


	/** Rotate left by left degrees; PAINT for forward steps. */

	public Turtlet paint (double left, double forward)
	{	super.paint (left, forward);
		theWorld.repaint();
		return this;
	}	//======================


	/** Fill a rectangle of the given width and height, Turtle at center. */

	public void fillBox (double width, double height)
	{	super.fillBox (width, height);
		theWorld.repaint();
	}	//======================


	/** Create a turtle at the center of the default JFrame. */

	public Turtle()
	{	this (false, 760, 600);  // special case of the constructor below
	}	//======================


	/** If makeNewWorld is true, make an additional JFrame of the given 
	 *  width and height.  Create a turtle at the center of the JFrame. */

	public Turtle (boolean makeNewWorld, int width, int height)
	{	super (makePage (makeNewWorld, width, height), 
			           width / 2, height / 2);
	}	//======================


	/** Only done as a separate method because super() has to be
	 *  the first statement in the any constructor. */

	private static Graphics makePage (boolean makeNewWorld, int w, int h)
	{	if (theWorld == null || makeNewWorld)
			theWorld = new TurtleWorld (w, h);
		return theWorld.getPage();
	}	//======================
}
//###################################################################


/** A TurtleWorld is a JFrame on which an Image object is drawn each time 
 *  the JFrame is repainted.  Each Turtle draws on that Image object. */

class TurtleWorld extends javax.swing.JFrame 
{
	private static final int EDGE = 3, TOP = 30;  // around the JFrame
	private Image itsPicture;
	private Graphics itsPage;

	public TurtleWorld (int width, int height)
	{	super ("Turtle Drawings");  // set the title for the frame
		setDefaultCloseOperation (EXIT_ON_CLOSE); // no WindowListener
		setSize (width + 2 * EDGE, height + TOP + EDGE);  
		toFront();  // put this frame in front of the BlueJ window
		setVisible (true);  // cause a call to paint
		begin (width, height);
	}	//======================


	public void begin (int width, int height)
	{	itsPicture = new java.awt.image.BufferedImage (width, height, 
			           java.awt.image.BufferedImage.TYPE_INT_RGB);
		itsPage = itsPicture.getGraphics();
		itsPage.setColor (Color.white);
		itsPage.fillRect (0, 0, width, height);
		itsPage.setColor (Color.black);
	}	//======================


	public Graphics getPage()
	{	return itsPage; // itsPicture.getGraphics(); => NO COLORS
	}	//======================


	public void paint (Graphics g)
	{	if (itsPicture != null)
			g.drawImage (itsPicture, EDGE, TOP, this);
	}	//======================
}
// </pre>


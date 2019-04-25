
/**
 * this class adds extended functionality to basic Turtle.
 * @author Alex Brelsford
 * @version 9/13/16
 */
public class SmartTurtle extends Turtle
{
    /**
     * 
     * draw a length 100 line with turtle centered
     * in the middle of the line
     * the angle of the line will be determined by the heading of the turtle.
     * 
    */
   
    public void drawLine () {
        
        paint (0,50);
        
        paint (180,100); /**first 2 commands draw the line */
        
        move (180,50);   /** Eliminates sideeffects */
        
        
    }
    /**
     * 
     * draws a circle with a plus inside
     * all Plus sides are 100px long and circle has a radius of 40
     * smartturtle at center
     * no effect on heading 
     * 
     */
     public void circleplus() 
     {
      
       drawLine(); /** Draws horizontal line of the plus */
       
       move (90,0); /** Moves turtle 90 degrees from origin */
       
       drawLine(); /** Draws the vertical line of the plus */ 
       
       swingAround (40); /** Draw's the Circle */
       
       move (-90,0); /** Moves the turtle facing right (original spot) */ 
       
    }
}    

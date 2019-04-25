
/**
 * This program can do everything a turtle can do but will be able to 
 * and will be able to draw windows and a building
 * 
 * @author Alex Brelsford
 * @version 9/22/16
 */
public class Builder extends Turtle
{
    /**
     * 
     * This method will  Draw a window 
     * at the center is the turtle
     * The window will be Turtle.ORANGE
     *It will be 50x50 with a plus in the middle that creates 25x25 boxes (4 of them)
     * 
     */
    public void drawWindow()
    {
        /** DRAW THE BOX*/
        
        switchTo (Turtle.ORANGE); //color goes to orange
        
        fillBox(50,50); //Draw's box
        
        /** DRAW Plus that is inside the Box*/
        
         switchTo (Turtle.BLACK); //color goes to black
        
        /** Horizontal Line*/
       move(0,25); //moves the turtle RIGHT 25 to the edge of where the box will be
       
       move (180,0); //moves the turtle to face LEFT
       
       paint (0,50); //paints the horizontal line FACING LEFT
       
       /**Move turtle to the center  */
       
       move (180,0); //turns turtle 180 to face RIGHT
       
       move (0,25); //moves turtle RIGHT 25 to the center
       
       move (90,0); //Turtle is facing UP 
       
       /** Draw the Vertical Line */
       
       move (0,25); //moves to top of where the line will start facing UP
       
       move (180,0); //facing DOWN
       
       paint (0,50); //paints line
       
        /** Move to center FACING RIGHT*/
        
        move (180,0); //facing UP
        
        move (0,25); //UP 25 
        
        move (-90,0); //FACING RIGHT
        
        /** DRAW OUTLINE*/
        /** Line 1*/
        
        move (0,25); //turtle moves to edge of box
        
        move (90,25); //upper right corner of box UP
        
        move(180,0); //DOWN
        
        paint (0,50); //lower right  DOWN
        
        /** Line 2*/
        
        move(-90,0); //FACING LEFT
        
        paint(0,50); //paint line
        
         /** Line 3*/
        
        move(-90,0); //FACING LEFT
        
        paint(0,50); //paint line
        
         /** Line 4*/
        
        move(-90,0); //FACING LEFT
        
        paint(0,50); //paint line
        
        /** MOVE TO CENTER*/ 
        
       move (-90, 25); //moves turtle DOWN to center line
       
       move (-90, 25); //moves turtle to the center facing left
       
       move (180,0); //TURTLE FACING RIGHT
        
       //mark (Turtle.BLACK);
        
    }
    
    
    
    /**
     * 
     * This method will draw a row of 3 windows
     * they will be 100 px from center to center apart
     * the turtle will be in the center of the middle one facing right
     * 
     */
    public void drawRowOfWindows()
    {
    
        drawWindow(); 
        
        move (0,100); //facing right
        
        drawWindow(); //second window
        
        move (180,200); //moves to where 3rd window will be facing left
        
        move(180,0); //facing right
        
        drawWindow();
        
        move(0,100); //moves to center
    
    }
    
    /**
     * 
     * this method will draw 3 floors of windows
     * 100px apart from eachother
     * turtle in the center of that center row
     * 
     */
    public void drawThreeFloorsOfWindows()
    {
        
        drawRowOfWindows(); //row 1 
        
        move(90,100); //facing UP
      
        move (-90,0); //Facing right
        
        drawRowOfWindows(); //row 2
        
        move (-90,200); //facing DOWN
        
        move(90,0); //Facing Right
        
        drawRowOfWindows(); //row 3
        
        move(90,100); //FACING UP
        
        move (-90,0); //faces RIGHT
        
        //mark (Turtle.BLACK);
    }
    
    /** 
     * 
     * this method will draw a  Turtle.BROWN box
     * 400x400 
     * then the drawThreeFloorsOfWindows(); the center row in the center of the 
     * box
     * 
     */
    
    public void drawBuilding()
    {
        
       switchTo(Turtle.BROWN); //switches color to brown
       
       fillBox(400,400); //Draw's the box
       
       drawThreeFloorsOfWindows(); //Draw's the windows
        
    }

}
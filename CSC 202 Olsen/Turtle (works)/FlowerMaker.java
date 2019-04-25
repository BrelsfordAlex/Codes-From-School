
/**
 *
 *Draw's flowers.
 * 
 * @author Alex Brelsford
 * @version 3/15/16
 */
public class FlowerMaker extends Turtle
{
   /** 
    * 
    * This method will draw a square petaled flower
    * and will not affect the location or heading of the turtle.
    * The FlowerMaker starts at the bottom center of the flower 
    * 200px  by 10 px stem. 
    * Flower center is 16.666 px in radius. 
    * Petals are 33.333 px wide and long.
    * Colors: 
    * Petals-Blue
    * Stem-green
    * Center- Red
    * 
    */
    public void squarePetaledFlower() 
   {
      
      /** Drawing the Stem */
      
      move (90,100); //moves turtle to center of where the stem will be 
      
      switchTo (Turtle.GREEN); //changes color for green for stem\
      
      move (-90,0); //to put width first in fill Box
      
      fillBox (10,200); //Draw's the stem
      
      /** Draw's the center of the Flower that will be red*/
      
      switchTo(Turtle.RED); //changes the color to red for the center
      
      move (90,100+16.666); //moves the turtle to where the center should be
      
      fillCircle (16.666); //draw's the center of the circle
      
      /** Drawing Petals */
      
      /** Petal 1*/
      
      move ( -45 , 33.333); //moves to where petal 1 should be
      
      switchTo(Turtle.BLUE); //petal Color
      
      move (-45,0); //moves again  to get where petaal should be
      
      fillBox (33.333,33.333); //draw's petal 1
      
      /** Petal 2 Drawing */
      
      move (45, -66.666); //to get into position to get to where the petal will be
      
      move (-45,0); //rotates turtle
     
      fillBox (33.333,33.333); //draw's petal 2
      
      /** Petal 3 */
      
      move (45,33.333); //moves to center
      
      move(-90, 33.333); //moves to where petal will be
      
      move (45,0); //angle of petal
      
      fillBox (33.333,33.333); //draw's petal 3
      
      /** Petal 4 */
      
      move (135,66.666);
      
      move (-135,0); //angles turtle correctly
     
      fillBox (33.333,33.333); //draw's petal 4
      
      /** get back to origin*/
      
      move (-45,33.333);
      
      move (135, -216.666);
      
      move(-90,0);
      
      //mark (Turtle.BLACK);
       
   }
   
   /** 
    * Draw's 2 square petaled flowers 
    * 120 px apart at the center
    * turtle at the center
    */
   public void drawTwoSquarePetaledFlowers() 
   {
       /** Flower 1*/
       
       move (0,60); //moves to where flower 1 is
       
       squarePetaledFlower(); //draws flower 1
       
       /** Flower 2*/
       
       move (0,-120); //moves to flower 2
       
       squarePetaledFlower(); //draws flower
       
       /** move to Center*/
       
       move (0,60); //moves to center
       
       //mark (Turtle.BLACK);
       
   } 
   /**
      * Draw's 5 blades of grass. 
      * 10px Wide
      *All blades will be Atleast  20 px high 
      * and blade 5 is 20 px high
      * Color is ORANGE
      * Turtle will be centered  on the bottom of the grass and facing right 
   */
   public void draw5Grass ()
   {
       
       /** Drawing the base of the blades 5px high 10 wide*/
       
       switchTo (Turtle.ORANGE);
       
       fillBox(50,30); //Draw's the base of the grass
       
       /** Draw Blade 3*/
       
       move (90,25); //Moves to draw blade 3
       
       fillBox (80,10); //This will draw blade 3
       
       /** Draw Blade 2*/
       
       move(90,10); //Moves to where the blade will be.
       
       fillBox (10,45); //Draw's the blade of grass
       
       /** Draw Blade 4 */
       
       move (180,20); //moves to where the blade will be. 
       
       move (90,0); // so turtle faces UP
       
       fillBox (45,10); //draw's the blade of grass FACING UP
       
       /** Move to draw Blade 5*/ 
       
       move (-90,10); //moves to position of the grass facing right
       
       move (90,0); //Faces UP
       
       fillBox (30,10); //draw's the blade of grass facing up
       
       /** Moves Turtle Back to the Center */
       
       move (180, 30); //moves turtle to the base of the GRASS FACING DOWN
       
       move (-90,15); //moves turtle to the center of the grass
       
       move (180,0); //Moves so turtle is facing right
       
       //mark (Turtle.BLACK);
      
    }
    /**
     * Copies draw5Grass 5 times to look like multiple grass spots.
     * Turtle will end up in the center of the drawing facing right 
     * one in the center 2 on the right and 2 on the left 
     * 
     */ 
    public void draw25Grass()
    {
        
        /** SET 1*/
        
        move (180,0); //Gets the turtle facing left
        
        move (0,60); //moves the turtle to where the grass will be
        
        move (180,0); //Turtle Facing right
        
        draw5Grass(); 
        
        /** SET 2*/
        move (90,0); //angles so turtles can line up
        
        move (0,5); //moves to where turtle should be
        
        move (-90,0); //angles back
        
        move (180,0); //turns turtle left
        
        move (0,55); //moves to where the grass is 
        
        move (180,0); //angles to FACE RIGHT
        
        draw5Grass();
        
        move (0,50); //to the center
      
        /** SET 3*/
        
         move (90,0); //angles so turtles can line up
        
        move (0,5); //moves to where turtle should be
        
        move (-90,0); //angles back
       
        move (0,45); 
        
        draw5Grass(); 
        /** SET 4*/
         move (90,0); //angles so turtles can line up
        
        move (0,5); //moves to where turtle should be
        
        move (-90,0); //angles back
        
        move (0,45); //goes to where grass will be
        
        draw5Grass();
       
        /** SET 5*/
        move (90,0); //angles so turtles can line up
        
        move (0,5); //moves to where turtle should be
        
        move (-90,0); //angles back
        
        move (0,45); //goes to where grass will be
        
        draw5Grass();
        /** Get to the center*/
        
        move (-90,0); //helps to get turtle to center
        
        move (0,5); //moves turtle to where the center will be
        
        move (90,0); //turtle at right angle
        
        move (180,0); //turns turtle 180 FACING LEFT
        
        move (0,90); //moves turtle to center
        
        move (180,0); //turtle faces right
        
        //mark (Turtle.BLACK);
        
    }    
       
}   

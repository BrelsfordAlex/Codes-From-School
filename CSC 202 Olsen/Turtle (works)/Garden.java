
/**
 * This program will call the methods that draw grass and multiple flowers and use them together
 * 
 * 
 * @author Alex Brelsford 
 * @version 9/21/16
 */
public class Garden
{
  /**
   * This is the main method for programming a garden
  */
  
  public static void main (String[] args)
  {
      
      FlowerMaker denny;
      
      denny = new FlowerMaker(); //creates the new FlowerMaker
      
      denny.drawTwoSquarePetaledFlowers(); //Draw's the flowers
      
      denny.draw25Grass(); //draw's the grass
      
  }    
  
      
}


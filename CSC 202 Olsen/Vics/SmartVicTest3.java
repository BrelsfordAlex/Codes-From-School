
/**
 *This class will use smartvic methods to test the new method moveToFirstSlot
 *Tested by  moveOns to move the vic to slot 8  
 *TEST CASES
 *1)11111110
 *
 *2)11110
 *
 *3)""
 * 
 * @author Alex 
 */
public class SmartVicTest3
{
      public static void main (String [] args)
    {
        
        Vic.reset(args);
        
        //Declare the SmartVic()
        
        SmartVic lilly; //smartvic will be named lilly
        
        lilly= new SmartVic();
        
        lilly.moveToFirstSlot(); //moves to first slot
        
        lilly.moveOn(); 
         
        lilly.moveOn();
          
        lilly.moveOn();
           
        lilly.moveOn();
            
        lilly.moveOn();
        
        lilly.moveOn();
        
        lilly.moveToFirstSlot(); //move back 
        
    }

}

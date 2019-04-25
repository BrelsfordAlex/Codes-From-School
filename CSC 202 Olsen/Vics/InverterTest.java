
/**
 * This application class will combine
 * all inverter methods to swap states of
 * first row and return to the first slot
 * Robustly
 * 
 * @author Alex Brelsford
 * @version October 11, 2016
 */
public class InverterTest extends Inverter
{
    /**
     * MAIN METHOD OF THE PROGRAM
     * Test Cases:
     * 1) "" (no slot)--Works--Works (should do nothing)
     * 2)"10"(2 slots)--Fails-- Works (swap CD's and go back)
     * 3) "1010"(4 slots)--Works--Works(^^^^^^^^)
     */
   public static void main (String[] args)
   {
       
      Vic.reset(args);
      
       /** Declare and Initializing*/ 
      Inverter isabella = new Inverter();
      
      
      isabella.swapState(); /** swaps all cd's in the first row*/
      
      isabella.isOnFirstSlot(); //Is the vic on the first slot?
      
      isabella.moveToFirstSlot();
      
   }
}

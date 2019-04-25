
/**
 *
 *Class that tests Smart Vic methods
 * 
 * @author Alex Brelsford
 * @version 9/29/16
 */
public class SmartVicTest2
{
    /**
     *Test Cases: 
     *
     *"110" - Bob should see a cd and move to the next slot --WORKS--Try2 WORK
     *
     *"001" - Bob shouldn't move at all. --WORKS--TRY2 WORKS
     *
     *"" - No errors should occur. At END-- Try1)FAIL--Try2)WORKS
     * 
     */
    public static void main (String [] args)
    {
        
        SmartVic.reset(args);
        
        //Declare the SmartVic()
        
        SmartVic bob;
        
        bob= new SmartVic();
        
        bob.robustMoveIfSeesCD(); //Uses method
        
    }
}

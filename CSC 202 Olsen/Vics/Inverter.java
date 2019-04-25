/**
 * This object class will write 3 methods at which 
 *these methods will extend Vics
 * 
 * @author Alex Brelsford 
 * @version 10/6/16
 */
public class Inverter extends Vic
{
    /**
     * This Method will see if there is a Slot where the Vic is
     * Then it will If there is a CD:
     *                  Take the CD and move to next slot
     * if there is no CD:
     *                  put a CD down
     *                  and move on
     * Robustly  
     */
    public void swapState()
    {
        
        while(seesSlot() == true) //While Vic sees a slot it will see
        {
            
            if(seesCD()) // if it sees  cd
            {
                
                takeCD(); //Vic will take the CD
                
                moveOn(); //and move on 
            
            }
            
            else //If there is no CD do the following
            {
                
                putCD(); /** Then vic will put down a cd*/
              
                moveOn(); /** and move on */
            
            }
            
        }
        
        /**
        while(! "1, 0".equals(getPosition()))
        {
            
                backUp();
    
        }
        */
        
    }
    
    /** 
     * This method will be boolean
     * @return true if the Vic was on the first slot
    */
   
   public boolean isOnFirstSlot()
   {
       
       boolean  slot;//DECLARING
       
       slot = false; //The return will always be false INITIALIZING
       
       /** UNLESS THE FOLLOWING*/
       if("1, 0".equals (getPosition()))
         {
             
             slot = true;
             
         }
         
       return slot;
       
   }
   
   /**
    * This method will:
    * move the vic to the first slot
    * from any spot in the program
    * robust
    */
   public void moveToFirstSlot()
   {
       
       while(! "1, 0".equals (getPosition())) /** While not in the first slot*/
       {
           
           backUp(); /** then back up*/
       
        }
       
   }
}
/**
 * Method 1 PsudoCode
 *  while (vic sees a slot is true)
 *  {
 *      then Vic will:
 *      if(there is a CD in the slot)
 *      {
 *          take the CD
 *          move on
 *      }
 *      
 *      or vic will if there is NO CD
 *      if(there is no CD)
 *      {
 *          put a cd down
 *          move on
 *      }
 *      Then it will do If not at position 1
 *      Then back up
 *  }
 * 
 */
/**
 * 
 * Method 2 Psudocode
 * 
 * boolean 
 * ___ = false
 * if("1, 0".equals(getPostion()))
 * {
 *     ____ = true
 * }
 * return _____
 */
/**
 * METHOD 3 Psudocode
 * 
 * while (! at "1, 0"  equals get position)
 * {
 *     backUp
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
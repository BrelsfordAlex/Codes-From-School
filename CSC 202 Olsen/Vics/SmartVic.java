
/**
 * 
 * This class adds functionality to VIC and 
 * includes some robust methods(No errors)
 * 
 * @author Alex Brelsford 
 * @verion 9/27/16
 */
public class SmartVic extends Vic
{
    public void takeCDMoveOn() 
    {
        /** Takes CD and moves on if the vic sees a slot*/
        if(seesSlot())/** If it sees a cd*/
        {
            takeCD(); /** Then the CD should be taken*/
            
            moveOn(); /** And move on.*/
            
        }
        
    }
    /** Moves on 1 slot if there is a CD but robustly */
    
    public void robustMoveIfSeesCD()
    {
        
        if(seesSlot()) //Sees Slot then they will see\/ 
        {
            if(seesCD()) /** If they see a cd*/
            {
                
                moveOn(); /**  Then moves on */
                
            }
        }
        
        
    }
    /** this method moves thee vic back to the first slot from whereever it is robustly*/
    public void moveToFirstSlot()
    {
        
        while(! "1, 0".equals(getPosition())) /**While ___ is not at the spot first spot */ 
        {
            backUp(); /** move backwards*/
        }
        
    }
    
    /**
     * 1)   Answer  false (declare and initialize)
       2)   While sees Slot 
            a.  If sees CD
                i.  Answer  true
            b.  Move on
       3)  While not at the beginning
            a.  Back up
        4)  Return answer
        *
        *this method will see if there is a cd in the row and RETURN true if there'
        *is atlease 1 cd in the row.
        *ROBUST
        *@return true when there is a CD in the row

     */
    public boolean rowHasCD()
    {
        
       boolean goal;
        
       goal = false; //initialize
       
       while(seesSlot())
       {
           
           if(seesCD())
           {
               
               goal = true; //will be true if there is a CD
               
           }
           
           moveOn(); //move on to next slot
           
       }
         
       while (! "1, 0".equals (getPosition()) )
       {
           
           backUp(); //back up
           
       }    
        
       return goal; 
       
    }
}
/**
 * METHODS GENERALIZE INSTRUCTIONS
 * APPLICATIONS TELL SOMEONE(NAME OF TURTLE) TO DO SOMTHING
 */
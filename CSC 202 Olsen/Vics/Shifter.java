
/**
 *This program has 5 methods each method will do somthing with the Vics
 *This is lab 11 phase e
 * @author Alex Brelsford
 * @version 11/3/16
 */
public class Shifter extends Vic
{
    
    /**
     * This method will test to see the slot that the vic in is the last slot 
     * @return  true if the slot the vic is in is the last slot
     */
    public boolean inLastSlot()
    {
        
        boolean fool; 
        
        fool = false; //fool will be false by default
        
        if(seesSlot()) //If the vic sees a slot it will move on
        {
            moveOn();
            if(!seesSlot()) //then it will check if it sees a slot if it doesnt
            {
                
                backUp(); //the vic will back up

                fool = true; //and return true
                
            }
            
            else //if it does see a slot
            { 
                
                backUp(); //it will back up
                
                fool = false; //and return false
                
            }
            
        }
        
        
        return fool; 
        
    }
    
    /**
     * This Methid will not be robust
     * Will move on 2 times
     */
    
    public void moveOnTwice()
    {
        
        moveOn();
        
        moveOn();
        
    }
    
    /**
     * - takes a CD out of the current slot and puts it in the previous slot
     * . For this method, you must assume the previous slot is empty. (Hint: use an if-else).
     */
    public void shiftLeftOneCD()
    {
        
        if(seesCD()) //if vic sees a CD
        {
            
            takeCD(); //it will take the cd
            
            backUp(); //back up
            
            putCD(); //and put the CD down
            
        }
        else
        {
            
            backUp(); 
            
        } 
        
    }
    
    /**
     *  This method will do the following
     *  shift all the cd's EXCEPT THOSE IN THE FIRST SLOT
     *  
     */
    public void shiftLeftAllNonTerminalSlots()
    {
        
        moveOn();
        while(seesSlot())
        {
            
           shiftLeftOneCD();
           
           moveOnTwice(); 
            
        }

    }
    
    /**
     * If there is a CD in the first slot it
     * should end up in the last slot
     */
    public void shiftLeftAllSlots()
    {
        
       
        if(seesCD()) //vic sees a cd in the first slot
        {
           
            takeCD(); //it takes the cd
            
            shiftLeftAllNonTerminalSlots(); //this shifts left all of the cd's except the first slot
            
            backUp(); //vic bakcs up to last slot
            
            putCD(); //vic puts the CD Down
            
        }    
        else
        {
            
            shiftLeftAllNonTerminalSlots(); //this shifts left all of the cd's except the first slot;
        }
        
        
        
        
    }
    
}

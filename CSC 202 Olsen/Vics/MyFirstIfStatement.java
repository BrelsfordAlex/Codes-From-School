
/**
 * 
 * An if statement that does the following
 * If the vic sees a cd in the slot then it will move to the next slot
 * If not it will stay still
 * 
 * @author Alex Brelsford 
 * @version 9/27/16
 */
public class MyFirstIfStatement
{
    /**
     * This is the main method of my program
     */
    public static void main (String[] args)
    {
        
        Vic.reset(args);
        
        Vic nancy; //Vic's NAME
        
        nancy = new Vic(); 
        
        if (nancy.seesCD()) /** If there is a CD in the slot*/
        {
            
         nancy.moveOn();   /** Then Nancy will move to next slot*/
         
        }    
        
    }
}

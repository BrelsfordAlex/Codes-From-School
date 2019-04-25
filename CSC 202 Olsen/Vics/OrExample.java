
/**
 *This program will start me on 
 *learning Or ( || ) statements'
 *Want both vics to move if one sees a CD
 * 
 * @author Alexandria Brelsford 
 */
public class OrExample
{
    public static void main (String[] args)
    {
        
        Vic.reset(args);
        
        Vic tim = new Vic();
        
        Vic tam = new Vic(); 
        
        /**
            if(tim.seesCD() && tam.seesCD())
            {
                tim.moveOn();
                
                tam.moveOn();
            }
        *wont work because only 1 true
        */
       /**
           if( !(!tim.seesCD() && !tam.seesCD()))
            {
                tim.moveOn();
                
                tam.moveOn();
            }
        
         * Works because it flips the answer results
         * and all False makes it false
         */
        
       if(tim.seesCD() || tam.seesCD())
        {
            tim.moveOn();
            
            tam.moveOn();
        } 
        /** Or statement same as !(!a&& !b) but easier to write and neater*/
    }
}
/**
 * if tim sees a cd OR tam sees a cd both will move on
 */

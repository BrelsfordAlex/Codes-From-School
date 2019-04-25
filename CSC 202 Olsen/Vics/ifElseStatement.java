
/**
 * This is the program where I learned If/Else
 * 
 * @author Alex Brelsford 
 */
public class ifElseStatement
{
    public static void main (String[] args)
    {
        /**
         * had this before in the or statement
         */
        Vic.reset(args);
        
        Vic tim = new Vic();
        
        Vic tam = new Vic(); 
        
       tim.moveOn();
            
       tam.moveOn();
       
       if(tim.seesCD() || tam.seesCD())
        {
            
            tim.moveOn();
            
            tam.moveOn();
            
        } 
        
        /** The following program will not work... 
        
       if(! (tim.seesCD() || tam.seesCD() ))
        {
            
            tim.backUp();
            
            tam.backUp();
            
        } 
        
         * Will not work because
         * The not will flip the 
         * tim.seesCD() || tam.seesCD()
         * if in the or statement it was true
         * then it will be false and Negate eachother
         * 
         */
        /** The following program shows what should work!*/
       else//is the if true? NO then do \/\/\/\/\/\/\/\/\/\/
       {
           
           tim.backUp();
            
           tam.backUp();
           
       }
        /**
         * Because if/else makes it so If(____=false)
         * else{___ happens) 
        */
  
    }
}
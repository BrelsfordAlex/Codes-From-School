
/**
 *Cass that moves vic to third slot.
 * 
 * @author Alex Brelsford 
 */
public class GoToThree
{
    /**
     * Moves VIC to third slot using 1 moveOn()
     * 
     * test cases
     * 
     * 1) "1" --move to END -- Fail--
     * 
     * 2) "" --no error--Fail--
     * 
     * 3) "111" --move to slot 3 --works--
     * 
     */
    public static void main (String[] args)
    {
        Vic.reset(args);
        
        Vic tom; //New vic called tom
        
        tom = new Vic();
         while(! "1, 2".equals (tom.getPosition()))
        {
          if(tom.seesSlot())
                {
                    tom.moveOn();
                }
        }
        /**
         * Psudocode:
         * while(vic is not at 3rd slot))
         * {
         *     ___.moveOn;
         *     
         *   if using not a true/false statement use "" to give exacts to make it true/false  
         *   look up java documentation for help
         *   equals compares strings
         *   ! means negate/Not
         * }
         */
    }
}

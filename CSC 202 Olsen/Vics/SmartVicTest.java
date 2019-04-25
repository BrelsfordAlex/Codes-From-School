
/**
 * 
 * tests SmartVic
 * @author Alex Brelsford
 */

public class SmartVicTest
{
    /** 
     * main method
     */
    public static void main (String[] args)
    {
        Vic.reset(args);
        
        SmartVic rodrigo;
        
        rodrigo = new SmartVic(); 
        
        rodrigo.takeCDMoveOn(); /** Test Method*/
        rodrigo.takeCDMoveOn();//2
        rodrigo.takeCDMoveOn();//3
        rodrigo.takeCDMoveOn();//4
        rodrigo.takeCDMoveOn();//5
        rodrigo.takeCDMoveOn();//6
        rodrigo.takeCDMoveOn();//7
        rodrigo.takeCDMoveOn();//8
        
    }
}

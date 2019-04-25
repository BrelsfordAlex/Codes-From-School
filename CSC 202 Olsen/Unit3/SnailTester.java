
/**
 *This application tests the method class Snail. 
 * @author Alex Brelsford
 */


public class SnailTester 
{

    public static void main(String args[]) 
    {
        
        Snail whatEverYouWantToCallIt = new Snail(2);
        /** inside the braces is what int start will be */
        
        Snail sadistic = new Snail(5); 
        
        whatEverYouWantToCallIt.moveOne(); 
        
        sadistic.moveOne();
        
        sadistic.moveOne();
        
        System.out.println( whatEverYouWantToCallIt.getDistance());
        
        System.out.println("sadistic slides forward " + sadistic.getDistance() + " units");
        
        
    }
    

}

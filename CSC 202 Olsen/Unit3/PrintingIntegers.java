
/**
 *Demonstrates how integer vairables work and how
 *printing statements works
 * @author Alex Brelsford
 * @version 11/1
 */
public class PrintingIntegers
{
    
    public static void main(String[] args)
    {
        
        System.out.println("This is my first println statement!!!");
        
        System.out.println("This number that I love is:" + 33);
        
        int number = 33;
        
        System.out.println("This number is one I hold dear to my heart, that number is: " + number);
        
        System.out.println("Here is the age at which I will live to " + (18 + number));
        
        System.out.println("I love my family. " + "My family loves me!");
        
        number = 4;
        
        System.out.println("This is the amount of members in my immediate family. " + number);
        
        number = number + number + number;
        
        int cow = 1;
        
        while (cow < 2000 )
        {
            
            System.out.println(" I have " + cow + " cows.");
            
            cow = cow + cow;
            
        }
        
        System.out.println("In the end I now have " + cow + " cows!");
        
        
        
        
    }
    
}

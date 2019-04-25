import java.util.Scanner;

/**
 * This program is am introduction to Scanners
 * this program will take a number and add one to it
 */


public class AddsOne
{

    public static void main(String args[]) 
    {
        
        System.out.println("Enter a number: ");
        
        Scanner stan = new Scanner(System.in);
        
        int carl;
        
        carl = stan.nextInt(); // this is how the scanner will takethe imput return it and put it to carl
        
        /** carl = carl + 1; adds one to the number */
        carl++; /** adds one to the number imputed */
        
        System.out.println( "Carl added one to your number it is now " + carl);
        
        
        
    }

}

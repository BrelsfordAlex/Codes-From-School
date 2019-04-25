
/**
 *This is Long Lab 13.
 *My assignment is as follows
 *(1) Look (DO NOT RUN) the code included below and 
                *describe in words what the program does.
*(2) Copy the code into a java file and run it
                *(if you try to copy and paste the resulting program will
                *not compile!). Be careful to observe exactly what 
                *happens.
*(3) Describe in words 
                *(1) what happened when you ran the program and
                *(2) what accounts for the
                        * differences (if there are any) 
                        * between your prediction of how the
                        * program would behave and how
                        * it actually did behave.

 * 
 * @author Alex Brelsford 
 * @version 11/2/16
 */
public class WhilePrinterOne
{
    
    public static void main(String[] args)
    {
        
        boolean printing = false;
        
        int value = 5;
        
        while(value < 20)
        {
            
            if(printing)
            {
                
                System.out.println("value: " + value);
                
                printing = false;
                
            }
            else
            {
                
                printing = true;
                
            }
            
            value = value + 2;
            
        }
        
    }
    
} 

/**
 *     --------------1 PREDICTION--------------------------
 * This code, when ran, will be defaulted to false. It then creates a
 * variable called value and that is 5. It then tells us while the value
 * is less than 20. If printing is false it prints the value name, if 
 * the printing variable is true then it is recorded as true. afterwards
 * the valie is added by 2. In my prediction it will be an infinity loop
 * 
 *   --------------2 After Being Ran--------------------------
 *      The code when ran did the following. It printed out numbers 7,11,15 and 19
 *   then stopped. The accountable differences between my prediction and the
 *   result, one has to be that it was not a infinite loop. What I did not
 *   account for in my prediction is the fact that it adds that value by 2 until
 *   the value is over 20. 
 * 
 */
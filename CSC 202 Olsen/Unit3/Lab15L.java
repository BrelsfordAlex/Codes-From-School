import java.util.Scanner;
/**
 *This program will tell a story of Amy who has figurines that her 
 *friend Barry has. She will give him 3 figurines when he gives her 
 *12 Comics of the series she loves.
 *
 *This will use 
 *  Uses a while loop 
 *Uses an if statement 
 *Has at least 3 print statements.   
 * 
 * @author Alex Brelsford
 * @version 11/6/16
 */

public class Lab15L
{
    
        /**
         * This is the main method of the program
         * it is sepperated by  sections
         */
    public static void main(String args[]) 
    {
       
        /** Initializing */
        
        Scanner keyboard = new Scanner(System.in); //Declaring
        
        /** Variables */
        
        double van; //takes a integer or decimal
        
        int barry = 12; 
        
        int  fans = 3; 
        
        int comics = 0;
        
        /** The code for the program */ 
        
        System.out.println( " Amy has a collection of figurines.");
        
        System.out.println("The amount of figurines she can be no "
                            + "less than 100. She has " );
                            
         /** Van is the user immputted number*/  
         
        van = keyboard.nextDouble(); //gets user imput
        
        /**  Number  rules. 30 > van < 100 */
        
        while( van > 100 ) /** This is incase user puts in # > 100 */
        {
            
           System.out.println("That number is to big " +
                                "please write a new one less " +
                                "than 100 ");
           van = keyboard.nextDouble(); //gets user imput
            
        }
        
        /** This is incase the number ends up to little!!! */
        
        while(van < 30) // the number has to be between 100 and 30
        {
            
            System.out.println(" That number is to small... Enter a new " 
                    + "one" );
            van = keyboard.nextDouble();         
            
        }
        //Code for printing out the story
        
        System.out.println( " Her friend Barry wants her collection so, ");
        
        System.out.println( "she tells him, for every " + barry + 
                            " of the comic Cosmic Lazer. ");
        
        System.out.println( " Amy will give him " +  fans + " figurines "
                             +" until none are left."); 
                             
        while ( van > 0 ) /** This is for getting  the vans to 0*/
        {
            
             van =  van - 3; 
             
            System.out.println( " Barry gives her 12 comics. " + 
                             "She give him 3 figurines.");
            System.out.println( " She now has " + van + " figurines.");
            comics = comics + 12; //comics is added by 12 while van > 0
            /** 
             * This statement shows while the user imputted number
             * will be subtracted by 3 until it is 0
             */                  
            
        }
        
         /**
          * The code below is the results
          * It should give the number of comics Amy has 
          * and it should say a text
          */
         
        if( van == 0)
        {
            
            System.out.println(" Amy has no figurines left. " + 
                                    " Barry is happy" + " so is Amy! ");
            System.out.println( " Amy has  " + comics + " comics");
            
        }
        
        if( van < 0)
        {
            
            System.out.println(" Amy has no figurines left. " + 
                                    " Barry is happy" + " so is Amy! ");
            System.out.println( " Amy has  " + comics + " comics");
            
        }
        
        // End of code 
        
    }

}


/**
 * CSC Lab 15 L Instructions: Write an application class that:
 * (1) Takes input from the user.
 * (2)  Uses a while loop 
 * (3)  Uses an if statement 
 * (4) Has at least 3 print statements. 
 * (5)  Has documentation on the class and ​
                * main method explaining what the program does 
 * 
 */

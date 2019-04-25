import java.util.Scanner;
/**
 * This is a game that will have 10 guesses and a password
 * if the password guessed is not the password  put in 
 * then you lose one guess
 * @author Alex Brelsford
 * @version 11/17/16
 */


public class PasswordGame
{
    /** THIS IS THE MAIL METHOD*/
    public static void main(String args[]) 
    {
        /** Initializing*/
        LockBox fredrick = new LockBox("Password"); /** ENTER YOUR PASSWORD IN THE PARETHESIS!!!!!!*/
        
        Scanner s = new Scanner(System.in);
        /**Variables */
        
        int guesses = 10; //this is the number of guesses
        String playerTwoGuess; //this is the guess of p2

        /**This is the Main programming*/
        
        while(guesses > 0 && fredrick.isLocked())
        {
            
            System.out.println("Hey! you have " + guesses + " Guesses. What is your guess?");
            
            playerTwoGuess = s.nextLine();
            if(fredrick.isLocked() == true)
            {
                
                guesses = guesses--; //guesses will subtract 1 if the guess is incorrect
                System.out.println("That is incorrect. " + guesses + " Guesses left"); 
                
            }
            
            
            if(fredrick.isLocked()== false)
            {
                
                System.out.println("YOU WON YAY!!!");
                
            }
            else
            {
                
                System.out.println("YOU Lose!!!!!!!");
                
                fredrick.printPassword(); //prints password
                
                
            }
            
        }
        /**
         * The point of this game is to have Player one put a password in where inticaded in this code
         * Then player 2 will have to guess the password.  If guessed wrong then
         * they loose 1 guess
         * 
         */
        
    }

}
/**
 *
            (3) Create a scanner which you will use to read
                            guesses from the user through the terminal. 
                            The psuedocode for the rest of the main method is as
                            follows :
                            while there are more guesses left and the lock-box is locked
                                    read a guess from the user
                                    if the guess is incorrect
                                            print “incorrect”
                                    if the lock-box is locked
                                            print the correct password
                                    else
                                            print “you win.”

   Create an application class, call it PasswordGame. In the main method, 
            (1) create a lock-box with
                    a password of your choice. 
            (2) Create an integer variable guesses which you will use to
                            determine if the user has more guesses left.                                          
 */
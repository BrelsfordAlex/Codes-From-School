/**
 * This object class will do the following
 * create a game where P2 guesses P1's password
 * 
 * 
 * @author (your name) 
 */
public class LockBox
{
        /**
         * Fields and Variables 
         */
    private boolean isLocked; //is the box locked(true) or not (false)
    
    private String itsPassword; //this is the storage for the password
       /**
        * CONSTRUCTORS
        */
    public LockBox(String password)
    {
    
        isLocked = true; //True because it simulates is the correct password guessed? No then it is true 
        
        itsPassword = password;
    
    }
    
    
    /** METHODS*/
        /**
     * This method will
     * return true if the box is still locked
     * and return false if it was opened
     * 
     * @return false when the correct password was guessed
    */
    public boolean isLocked()
    {
         if(itsPassword.equals( itsPassword))//if the password was guessed coreectly then 
         {
            
             isLocked = false;
            
         }
        return isLocked;
        
    }
    
    /**
     * This method is supposed to have the user imputted guess 
     * if correct --> it should unlock the box
     * if wrong -->it should stay locked
     */
    public void unlock(String password)
    {
        
        //If the  password is equal to itsPassword, then the box should become unlocked.
        if (password.equals (itsPassword))
        {
            
            System.out.println(" You guessed the right password! You WIN!!!!!!"); 
            // ^^^^ FOR IF YOU WIN
            
        }
    }
    
    
    /**
     * This method should print the password after all of the guesses are done.
     */   
    public void printPassword() 
    {
        
        System.out.println(itsPassword); //returns the password
        
    }
       
}
/**
 *

(4) Create an application class, call it PasswordGame. In the main method, 
            (1) create a lock-box with
                    a password of your choice. 
            (2) Create an integer variable guesses which you will use to
                            determine if the user has more guesses left. 
            (3) Create a scanner which you will use to read
                            guesses from the user through the terminal. 
                            The psuedocode for the rest of the main method is as
                            follows (following page):
 *(1)  two fields 
 *          (a) private Boolean isLocked --- keeps track of whether the box is locked or not.
 *          (b) private String itsPassword --- store the correct variable in this variable.
 * (2) three methods:
            **(a) isLocked() --- returns true if the lock-box is currently locked.
            (b) unlock(String password) --- this method simulates the unlocking procedure. If the
                        password is equal to itsPassword, then the box should become unlocked.
            (c) printPassword() --- this method prints the correct password to the terminal.
 * (3) The class will have one constructor:
            (a) LockBox(String password) --- this builds a new lock-box with the given password.
 *          
 *          
 */



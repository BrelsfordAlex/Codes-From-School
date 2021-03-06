
/**
 * This is a class that simulates snails
 * an object in this class will do somthing 
 * that snails can do like move
 * These snails "move" along the number line
 * towards positive numbers
 * @author Alex Brelsford 
 * @version 11/10/16
 */
public class Snail
{
    
    /**
     * Declaring  And Initializiing
     */
    private int itsStart; //DECLARATION 

    private int itsLocation;  //stores snails location
    /** 
     * Constrictor
     * Creates a new snail ( i.e initialize all snail fields)
     * @param start tells where the snail startss
     */
    
    public Snail(int start) //Start = a number
    {
        
        //purpous is to initialize all fields
        itsStart = start;
        
        itsLocation = start; 
        
    }
    
    
    /**
     * Returns the distance the Snail has moved
     */
    
    public int getDistance()
    {
        
        int distance = itsLocation - itsStart;
        
        return distance; 
        
    }
    
    
    /**
     * Moves the snail forward one slide
     */
    public void moveOne()
    {
        
        itsLocation++; //adds one to the location
        
    }
    
    
    /**
     * This method will move the snail a user imputted amount. 
     * Snail will complain and not love if it gets a negitive number
     * @param numberOfSlides 
     */
    public void slideRight(int numberOfSlides)
    {
        
      if(numberOfSlides < 0) //if the number is negitive
      {
        
         System.out.println("I hate this number!!!!"); //do this
          
      }
      else//if the number is positive
      {
          
          while(numberOfSlides > 0 ) //while it is positive
          {
              
              moveOne(); //move on  
              
              numberOfSlides = numberOfSlides - 1; //to help stop the while loop 
              
          }
          
      }
        
    }
    
    
    public int getLocation()
    {
        
        return itsLocation;
        
    }    
    
    
    /**
     * This method will 
     * TEST to see if 2 snails are in the same location
     * @param other another snail
     */
    public boolean sameLocation(Snail other)
    {
        
       boolean answer = false; //answer will always be false UNLESS
       
       if(other.getLocation() == getLocation()) //If the other snail's locatin == the users programs snail
       {
        
         answer = true; 
        
       }
       
       return answer;
        
    }
    
    
    
    
}
/**
 * Fields (Instance Variables)
            * What information does  ______ need to know?
                    *Answer: Starting point
                        *  Where it is on the number line
                           *  Field that stores where the snail started
                              * private int itsStart
                                *FIELDS ARE ALWAYS PRIVATE
 *  
 */
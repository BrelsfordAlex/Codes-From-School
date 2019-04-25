package ClassWork;
import java.util.Arrays;
/**
 * By Alex and Austin
 */

/****************************************************************************** 
* Using the specifications for each method implement the code. 
* An IntArrayBag is a collection of int numbers. 
* The same number may appear multiple times in a bag. 
* The numbers are not in any particular order. 
* Create a driver program to test the class. 
* Create objects to test every method. 
* The driver program should output these results. 
******************************************************************************/ 
public class IntArrayBag implements Cloneable 
{ 
  // The number of elements in the bag is in the instance variable  
  // numberOfItems, which is no more than data.length(). 
  // For an empty bag, we do not care what is stored in any of data; 
  // or a non-empty bag, the elements in the bag are stored in data[0] 
  // through data[manyItems-1], and we dont care whats in the 
  // rest of data. 
   
  private int[ ] bag; 
  private int numberOfItems;  
   
  /** 
  * Initialize an empty bag with a default initial capacity of 10.   
  * @param - none 
  * @postcondition 
  *   This bag is empty and has an initial capacity of 10. 
  *   new int[10]. 
  **/    
  public IntArrayBag( ) 
  { 
      bag = new int[10]; //this makes the bag array have capacity of 10
  } 
     

  /** 
  * Initialize an empty bag with a specified initial capacity. 
  * @param initialCapacity 
  *   the initial capacity of this bag 
  * @precondition 
  *   initialCapacity is non-negative. 
  * @postcondition 
  *   This bag is empty and has the given initial capacity. 
  * @exception IllegalArgumentException 
  *   Indicates that initialCapacity is negative. 
  **/    
  public IntArrayBag(int initialCapacity) 
  { 

	  try
	  {
		  
		  int size;
		  size = initialCapacity;
	      if(size > 0)
	      {
		  bag = new int [size];
	      }
	  }
	  catch(IllegalArgumentException  e)
	  {
		  
		  System.out.println("Illegal size. try again...");
		  
	  }
	  
	  
  } 
        
 
  /** 
  * Add a new element to this bag.  
  * @param element 
  *   the new element that is being inserted 
  * @postcondition 
  *   A new copy of the element has been added to this bag. 
  **/ 
  public void add(int element) 
  { 

	  int i = 0;
	  bag[i]= element;
	  i++;
  } 


  /** 
  * Add the contents of another bag to this bag. 
  * @param addend 
  *   a bag whose contents will be added to this bag 
  * @precondition 
  *   The parameter, addend, is not null.  
  * @postcondition 
  *   The elements from addend have been added to this bag. 
  * @exception NullPointerException 
  *   Indicates that addend is null.  
  * @exception 
  * @note you have to verify that there is enough space in the array to add 
  * more elements. You can only add more elements to the array if there is enough 
  * space to hold all the elements after you add them. 

  public void addAll(IntArrayBag addend) 
  { 
	  try
	  {
     for(int i= 0; i <bag.length; i++)
     {
    	 addend = new IntArrayBag();
    	 if(bag[i])
    	 {
    	 bag[i]= addend[i];
    	 }
     }
	  }
	  catch(NullPointerException  e)
	  {
		  System.out.println("Uh oh thats null!!!");
	  }
  }    
   
   
  /** 
  * Generate a copy of this bag. 
  * Clone an IntArrayBag object. 
  * @param - none 
  * @return 
  *   The return value is a copy of this bag. Subsequent changes to the 
  *   copy will not affect the original, nor vice versa. 
    
  public IntArrayBag clone( ) 
  {   
  IntArrayBag bag2 = new IntArrayBag();
   bag2 = bag;
   
   return bag2 ;
   
  } 
   

  /** 
  * Accessor method to count the number of occurrences of a particular element 
  * in this bag. 
  * @param target 
  *   the element that needs to be counted 
  * @return 
  *   the number of times that target occurs in this bag 
  **/ 
  public int countOccurrences(int target) 
  { 
	  int oc=0;
	  for(int i = 0; i<bag.length;i++)
	  {
		while(  bag[i] == target)
		{
		  oc++;
		}
	  }
	  return oc;
  } 


              
  /** 
  * Remove one copy of a specified element from this bag. 
  * @param target 
  *   the element to remove from the bag 
  * @postcondition 
  *   If target was found in the bag, then one copy of 
  *   target has been removed and the method returns true.  
  *   Otherwise the bag remains unchanged and the method returns false.  
  **/ 
 // public boolean remove(int target) 
  //{ 
     
     
  //} 
                 
   
  /** 
  * Determine the number of elements in this bag. 
  * @param - none 
  * @return 
  *   the number of elements in this bag 
  **/  
//  public int size( ) 
  //{ 
      
 // } 
   
   
  /** 
  * Reduce the current capacity of this bag to its actual size (i.e., the 
  * number of elements it contains). 
  * @param - none 
  * @postcondition 
  *   This bag's capacity has been changed to its current size. 
  **/ 
 // public void trimToSize( ) 
  //{ 
      
  //} 
      

  /** 
  * Create a new bag that contains all the elements from two other bags. 
  * @param b1 
  *   the first of two bags 
  * @param b2 
  *   the second of two bags 
  * @precondition 
  *   Neither b1 nor b2 is null 
  * @return 
  *   the union of b1 and b2 
  * @exception NullPointerException. 
  *   Indicates that one of the arguments is null. 
  * @note create another array big enough to hold both arrays 
  **/    
 // public static IntArrayBag newBag(IntArrayBag b1, IntArrayBag b2) 
 // { 
 //     
 // } 
  public static void main(String[] args)
  {
	  
	  IntArrayBag test1 = IntArrayBag();
	  
	  
  }
}

           
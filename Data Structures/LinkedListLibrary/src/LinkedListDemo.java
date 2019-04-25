import java.util.*;
public class LinkedListDemo
{

	public static void main(String[] args)
	{
		//Variables
		String bleh;
		String meh;
		String Wey = null ;
		int wee;
		//Declaring
		LinkedList<String> linkedlist= new LinkedList<String>(); //declares linked list (from library)
		Scanner scan = new Scanner(System.in);
		//code
		
		/**
		 * What this string linkedlist is for is to
		 * hold all of Steves favorite foods. and he has alot of them
		 * 
		 */
		//Adding to the list
		System.out.println("Printing my favorite foods...");
		linkedlist.add("Double Cheese Burger");
		linkedlist.add(" Cheese Burger");
		linkedlist.add("Double  Hamburger");
		linkedlist.add("Fries");
		linkedlist.add("Grilled Cheese");
		linkedlist.add("Spagetti");
		linkedlist.add("Candy");
		linkedlist.add("Coffee");
		linkedlist.add("Chocolate");
		//displaying food
		
		System.out.println("My Favorite Foods!!!!" +  linkedlist);//displaying
		System.out.println("Do you like anything here?(1 for yes 2 for no)");
		wee = scan.nextInt();//asking person if they like any of the foods in the list
		if(wee == 1)//asking what they like?
		{
			System.out.println("What do you like? ");
			Wey = scan.next();
	
		if(linkedlist.contains(Wey) == true)
		{
			// just a little fun 
			linkedlist.add(Wey);//adding what was said to the list
			System.out.println("WOW really? I LOVE THAT!!!! BBFLs!!!");
			System.out.println("System: Reply to steve");
			scan.next();
		}
		}
		else if( wee == 2)
		{
			System.out.println("What Do you like?");
			meh = scan.next();

			System.out.println("OO that sounds good I will add it to my list!! ");
			linkedlist.add(meh);
		}
		
		

		System.out.println("Final List: " + linkedlist);
		}

		
	}


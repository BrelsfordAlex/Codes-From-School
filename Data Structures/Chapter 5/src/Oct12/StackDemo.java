package Oct12;
import java.util.*; //importing stacks 
/**
 * this is the demo class i made to test out stacks. 
 * Stacks are basically you have a list. the first pushed in (added) then another is pushed and so on. when
 * wanting to remove you Pop it off. it takes off the latest one that was added. First in Last out(FiLo). Use all methods

 * @author brelsforda382
 *
 */
public class StackDemo
{

	public static void main(String[] args)
	{
		//Varaibles
		
		String userInput;
		
		String a;
		
		int count = 0; //counter variable
		int index = 0;
		
		
		//Declaring
		
		Scanner scan = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();// the <> are to declare what typer it is. Stack is a generic class(Class with no defined type)
		
		//Code
		//Adding & empty
		System.out.println("Hello! Welcome to Stacking with Stan! First Lesson: Adding your first item to the stack.");
		System.out.println("First lets check if the stack is Empty. Type: empty to continue");
		userInput = scan.next();
		if(userInput.equals("empty"))
		{
			stack.isEmpty(); //checks if stack is empty
			if(stack.isEmpty() == true)
			{
				System.out.println("Great Job! The stack is empty!!!! :D");
				
			}
			
		}
		else
		{
		 System.out.println("You fail. You did not type it right. Press play to restart.");
			scan.close();
			
		}
		
		
		System.out.println("Now that the stack is empty, we can start adding to the Stack.");
		
		System.out.println("To do that I will ask you to type in a letter and I will tell you Push! and it will be added.");
		
		System.out.println("Loading up Standby.");
		
		System.out.println(". . . .");
		
		System.out.println("Okay please type ANY letter of the alphabet.");
		
		userInput = scan.next(); //next thing typed is put ot user input
		
		System.out.println("Adding " + userInput + " to the stack. Standby");
		
		
		System.out.println(". . . .");
		
		System.out.println(". . . .");
		
		stack.push(userInput);
		
		System.out.println(stack + " Added to your stack. Lets try that again!");
		
		while(count < 5)
		{
			System.out.println("Loading up Standby.");
			
			System.out.println(". . . .");
			
			System.out.println("Okay please type ANY letter of the alphabet.");
			
			userInput = scan.next(); //next thing typed is put ot user input
			System.out.println(". . . .");
			
			System.out.println("Adding " + userInput + " to the stack. Standby");
			
			stack.push(userInput);
			
			System.out.println("Current Stack: " + stack);
			
			System.out.println(". . . .");

			
			System.out.println(userInput+ " Added to your stack.");
			
			System.out.println(". . . .");
			
			count++;
			
			System.out.println((10 - count) + " Times left." );
		}
		/**
		 * What the loop is doing is getting 10 other items for the stack
		 */
		//Peaking
		
		System.out.println("Lesson 2: Peaking.");
		
		System.out.println(" ");
		
		System.out.println("What you do is peak at the top of the stack and then read the letter.");
		
		System.out.println(" ");
		
		System.out.println("Type: peak to continue");
		
		System.out.println(" ");
		
		userInput = scan.next();
		
		if(userInput.equals("peak"))
		{
			stack.peek(); //this peaks at thr top of the stack
			
			
				System.out.println("Great Job! The stack's latest entry was: " + stack.peek() + " :D");
				
			
			
		}
		else
		{
		 System.out.println("You fail. You did not type it right. Press play to restart.");
			scan.close();
			
		}
		//searching
		System.out.println("Great Job! 2 more lessons to go! This lesson. Stack Searching");
		System.out.println(" ");
		
		System.out.println("This isn't like soul searching. Remember your stack?");
		System.out.println(" ");
		
		System.out.println(stack);
		
		System.out.println("Choose any of those letters to search. When you decide Type: search to continue");
		
		System.out.println(" ");
		
		
		userInput = scan.next();
		
		if(userInput.equals("search"))
		{
			System.out.println("Ready? Good! now tell me what you wanna search!");
			
			System.out.println(" ");
			
			userInput = scan.next(); 
			
			index = stack.search(userInput);//this searches for ____ in the stack
			
			System.out.println(userInput + " was in the stack. Your stack is: " + stack);
			
			System.out.println(" ");
			
			System.out.println("The index of  " + userInput + " is " + index);
			
			
		}
		else
		{
		 System.out.println("You fail. You did not type it right. Press play to restart.");
			scan.close();
			
		}
		//remove
		System.out.println("Last Lesson Popping off of the stack. What this will do is  ");
		
		System.out.println("remove an item from your stack and then read you what your stack is now!  ");
		
		System.out.println("After this is a little... test ");
		
		System.out.println("Type: pop to Continue. ");
		
		userInput = scan.next();
		
		if(userInput.equals("pop"))
		{
			System.out.println("Ready? Good! Let's get Poppin!");
			
			System.out.println(" ");
			
			int counter = 6; 
			while(counter != 0 )
			{
			a = stack.pop();//this removes the index 1 of the stack
			
			System.out.println(a + " was removed from the stack. Your stack is: " + stack);
			
			System.out.println(" ");
			
			counter--;
			}		
			
		}
		else
		{
		 System.out.println("You fail. You did not type it right. Press play to restart.");
			scan.close();
			
		}
		
		//test time!!!
		int grade = 0;
		int wrong = 0;
		int right = 0;
		System.out.println("Test Time! ");
		System.out.println("What you do is enter A, B, C, or D. In capitals ");
		
		System.out.println("Question 1: What does pop mean? ");
		
		System.out.println("A: a soda ");
		
		System.out.println("B: a lolipop ");
		
		System.out.println("C: to remove the index 1 of a stack ");//correct answer
		
		
		System.out.println("D: DURRRRRRRR I dunno ");
		
		userInput = scan.next();
		
		if(userInput.equals("C"))
		{
			grade = 10;
			right = 1;
		}
		else
		{
			wrong = 1;
			grade = -10;
		}
		//question 2
		System.out.println("Question 2: Stack is the type ____ ");
		
		System.out.println("A: Integer ");
		
		System.out.println("B: String ");
		
		System.out.println("C: I don't know ");
		
		
		System.out.println("D: Generic ");//correct
		
		userInput = scan.next();
		
		if(userInput.equals("D"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
		}
		//question 3
		System.out.println("Question 3: Push means? ");
		
		System.out.println("A: Push it to the limit ");
		
		System.out.println("B: the chair ");
		
		System.out.println("C: I don't know ");
		
		
		System.out.println("D: to add to the stack");//correct
		
		userInput = scan.next();
		
		if(userInput.equals("D"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
		}
		//question 4
		System.out.println("Question 4:Does peak remove from the stack?");
		
		System.out.println("A: YEEEEEE! ");
		
		System.out.println("B: No. ");//correct
		
		System.out.println("C: I don't know ");
		
		
		System.out.println("D: Maybe? ");//correct
		
		userInput = scan.next();
		
		if(userInput.equals("B"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
		}
		//question 5 empty
		System.out.println("Question 5: Empty() does? ");
		
		System.out.println("A: Checks if the stack is empty ");//correct
		
		System.out.println("B: makes the stack empty. ");
		
		System.out.println("C: I don't know ");
		
		
		System.out.println("D: Generic ");
		
		userInput = scan.next();
		
		if(userInput.equals("A"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
		}
		//question 6 search
		System.out.println("Question 6: When searching in a stack you use what method");
		
		System.out.println("A: yes()");
		
		System.out.println("B: stack.search()");//correct
		
		System.out.println("C: I don't know ");
		
		
		System.out.println("D: you don't ");
		
		userInput = scan.next();
		
		if(userInput.equals("B"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
		}
		//question 7 inport
System.out.println("Question 7:What is the thing to import a stack? ");
		
		System.out.println("A: scanner scan = new scanner() ");
		
		System.out.println("B: stack.push ");
		
		System.out.println("C: import jave.util.*"); //correct
		
		
		System.out.println("D: Duhhhh");
		
		userInput = scan.next();
		
		if(userInput.equals("C"))
		{
			grade = grade + 10;
			right = right + 1;
		}
		else
		{
			wrong = wrong + 1;
			grade = grade - 10;
			System.out.println("you got " + wrong + " wrong");
			System.out.println(right + " right");
			System.out.println(" your grade is: " + grade + " out of 60");
		}
	}

}

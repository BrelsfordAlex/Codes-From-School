package Sept28;
import java.util.ArrayList;//imports array lists
import java.util.Scanner;//imports scanner

public class ArrayListDemo2 
{
	//What this main class will do
	/**
	 * What this will dop is use an array list that holds kids in the classes names
	 * another array list will hold their grades 
	 * the name corrisponds to the grade order
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Variable
		String string = null; 
		int graded = 0;
		double score;
		int answer;
		int kale;
		String name;
		int finished = 0;
		//Declaring
		ArrayList <String> nameList = new ArrayList <String>();
		ArrayList <Integer> grade = new ArrayList <Integer>();//for the type of array the type has to have a capital 
		Scanner scan = new Scanner(System.in);
		//Code
		/** INITIAL PROMPT*/
		System.out.println("This program will have you enter your students names and their grade");
		System.out.println("Using a set of ArrayList methods this class will have you do a number");
		System.out.println(" of challenges to complete this little game... Each challenge completed");
		System.out.println(" will earn you points. ");
		System.out.println("Would you like to play? Type 1 for YES and 2 for NO");
		/** Would they like to try response*/
		answer = scan.nextInt();
		if(answer == 1)
		{
			/**PRESSED 1*/
			System.out.println("Welcome to the ArrayList Minigame!!!!!");
			System.out.println("**NOT AN ACCTUAL GAME**");
			System.out.println("Please enter a name :");
			name = scan.next();
			
			System.out.println("Okay " + name + " Challenge one: Adding your students and grades ");
			/**Challenge one: Adding your students and grades */
			while(finished >= 0)
			{
			System.out.println("Please enter your student's name: ");
			string = scan.next();
			nameList.add(string);
			System.out.println("Now enter " + string+ "'s grade!");
			graded = scan.nextInt();
			grade.add(graded);
			System.out.println(string + "'s grade is: " + graded);
			System.out.println("Type =1 if finished. if not type 1");
			finished = scan.nextInt();
			}
			System.out.println("Printing Students and grades....");
			System.out.println(". . . . . .");
			System.out.println(". . . . . .");
			int i = 0;
			while(i <= nameList.size())
			{
				 for (String entry : nameList)
			           System.out.println(entry);
				
				
			}
			/***/
			/***/
			/***/
			/***/
			
			
		}
		else
		{
			/** PRESSED 2*/
			System.out.println(". . . Loading Response . . .");
			System.out.println(". . . . . .");
			System.out.println(". . . . . .");
			System.out.println(". . . . . .");
			System.out.println(". . . . . .");
			System.out.println("System Failure!!!");
			System.out.println("System Reboot? Type 1 for YES and 2 for NO");
			System.out.println("Response Error!!!!!");
			System.out.println("Shutting Down.");
			scan.close();//closes scanner
		}
		

	}

}

package ChapterExamples;
/**
 * In class
 * Have to identify occuencces of 
 * Instance and class variables
 * overloaded methods
 * constructors
 * accessors
 * mutators a
 * instances of a class
 * static methods
 * @author brelsforda382
 *
 */
public class Student 
{
	/**
	 * These are  instance variables
	 * Private and public it doesnt matter
	 * both are instances
	 */
   private int id;
   private String name;
   private double subj1;
   private double subj2;
   private double subj3;
   /*
    * This is a class variable also known as a static variable. this will apply to all instances
    */
   public static int numberOfStudents = 0; 

   
   
   public Student() {
	   this.id = 0;
	   this.name = "no name";
	   this.subj1 = 0.00;
	   this.subj2 = 0.00;
	   this.subj3 = 0.00;
	   numberOfStudents++;
	   
   } 
   /**
    * These methods (Constructors)
    * Are overriding methods
    * they are methods of the same name doing different things
    * These are also constructors.
    * @param id
    * @param name
    */
   public Student (int id, String name) {
	   this.id = id;
	   this.name = name;
	   subj1 = 0.00;
	   subj2 = 0.00;
	   subj3 = 0.00;
	   numberOfStudents++;
   }
   
   public Student(int id, String name, double subj1, double subj2) {
	   this.id = id;
	   this.name = name;
	   this.subj1 = subj1;
	   this.subj2 = subj2;
	   numberOfStudents++;
   }
   
   public Student(int id, String name, double subj1, double subj2, double subj3) {
	   this.id = id;
	   this.name = name;
	   this.subj1 = subj1;
	   this.subj2 = subj2;
	   this.subj3 = subj3;
	   numberOfStudents++;
   }
   
   public static char scoreToLetterGrade(double d) {
	   
	   char result;
	   if (d >= 90)
	      { result = 'A'; }
	   else {
	      if (d >= 80) 
	         { result = 'B'; }
	      else {
	         if (d >= 70) 
	            { result = 'C'; }
	         else {
	            if (d >= 60)
	               { result = 'D'; }
	            else {
	               result = 'F';
	            }
	         }
	      }
	   }
	  return result;
	}
   
/**
 * This is a getter AKA an accessor
 * @param a
 * @param b
 * @param c
 */
   public void getAverage (double a, double b, double c) {
	   
	   double average = 0.0;
	   average = (a + b + c)/3;
	   System.out.println("Your average is: " + average);
	   
   }
   
   public void getAverage (double a, double b) {
	   
	   double average = 0.0;
	   average = (a + b)/2;
	   System.out.println("Your average is: " + average);
	   
   }
   
   
public int getId() {
	return id;
}
/**
 * This is a settor aka a mutator
 * @param id
 */
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getSubj1() {
	return subj1;
}
public void setSubj1(double subj1) {
	this.subj1 = subj1;
}
	
public double getSubj2() {
	return subj2;
}
public void setSubj2(double subj2) {
	this.subj2 = subj2;
}
public double getSubj3() {
	return subj3;
}
public void setSubj3(double subj3) {
	this.subj3 = subj3;
}
/**
 * This is a static method
 * @return
 */
public static int getNumberOfStudents() {
	return numberOfStudents;
}
}

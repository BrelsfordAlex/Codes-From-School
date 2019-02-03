/**
What this program is to do:
1)Take a number (a) from the user
2)see if it is positive
3)if it is positive then get all prime numbers from a
 */
#include<iostream>
using namespace std;
int main()
{
  /** Variables*/
      int a=0;
      //a= for the user inputted number    

      /** Asking for the number*/
      cout<<"Welcome to the Find my prime game!"<<endl;
      cout<<"You(the user) will input a number you wish to see the prime of..."<<endl;
      cout<<"And I (the program) will give you all of those prime numbers1"<<endl;
      cout<<"Please give me the number: "<<endl;
      cin>>a;
      
      /** Seeing if the number is positive*/
      while(a<0)
      {
	cout<<"Please give me a number greater than 0"<<endl;
	cin>>a;
      }//while end
      
      /** Finding all the prime numbers */
      cout<<"Thank you for inputting: "<< a <<endl;
      cout<<"I will now find all of the prime numbers"<<endl;
      cout<<"The prime numbers are: ";
   
      /** Finding the prime numbers*/
      
      for(int i=2;i<=a;i++)
	{
	  bool c= true; //used to tell if it is prime or not
	  for(int j=2; j < i ; j++)
	    {
	      if(i % j == 0)
		{
                    c = false;
                     break;
                }
	    }//for end
	  /** 
	      What the internal forloop does is 
	      if the number isnt prime
	      then c will be false and break the loop
	   */
	  if(c==true)
	    {

	      cout<< i<<" ";

	    }  

	}
      cout<< " "<<endl;
      cout<<" There are all the prime numbers."<<endl;
      cout<<"The program will now end"<<endl;
      /**
	 What this loop does is 
	 while c is true for testing if somthing is prime or not
	 if it isnt prime c goes from true to false
	 and if it is false it breaks the loop and goes to the 
	 next number 
	 this works for all prime numbers 
	 because a prime number can only be divided by 1 and itself
	 so if i%j IS 0 it means it is not prime 
       */

	
      
  return 0;
}//end main

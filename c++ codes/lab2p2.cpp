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
  int a,b,c,d=0;
  //a= for the user inputted number
  //b=
  //c=
  //d=
  
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
      }
  /**Finding all the prime numbers */
  

  
  return 0;
}

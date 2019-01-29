
/**
this is a guessing numbers game
what this program will do is have the user guess a number between 1 and x
x being the limit that the user wants
*/
#include<ctime>
#include<cstdlib>
#include<iostream>
/**
About the libraries
the ctime and the cstdlib  are used for the random number generator 
iostream is standard for us to use early in the semester
 */
using namespace std;
int main()
{

  /** Variables*/
  int w,x,y,t=0;
  int z=0;
  /**
     t= the guess the user made
     w= the random number 
     x= the user limit
     y=x+1
     z= guesse made   
  */

  /** Declaring things*/
  srand(time(NULL));//ALWAYS NEED FOR GENREATING RANDOM NUMBERS

  /** Game Directions*/
  cout<<"Welcome to the Guess my Number game!"<<endl;
  cout<<"The Directions: "<<endl;
  cout<<"I will ask you for how high you want my number to be (1 to your number)."<<endl;
  cout<<"The higher the number the more difficult it is."<<endl;
  cout<<"As you make your guesses I will tell you if you guess is higher or lower than my number"<<endl;
  cout<<"When you get the number I will tell you you win and how many guesses it takes~"<<endl;
  cout<<"Have fun!!"<<endl;
  
  /** Game starting*/
  
  //getting the limit
  
  cout<<"Please enter how high you want my number to go: "<<endl;
  cin>>x;
  y=x+1;//y is what you will mod the random number by to get the limit of x
  w=rand()%y;//w is the random number

  //guessing the number
  while(t !=w)
    {

      cout<<"Please make a guess."<<endl;
      cin>>t;
      if(t==w)//seein if their guess is right if it is 
	{
	  cout<<"You won! with "<<(z+1)<<" guesses!"<<endl;//then they won
	  break;
	}
      else//if not 
	{
	  if(t>w)//is it higher
	    {
	      cout<<"to high of a number."<<endl;
	    }
	  else if (t<w)//or lower
	    {
	      cout<<"to low of a number."<<endl;
	    } 
	}
      z=1+z;//guesses made 
      cout<<"guesses so far: "<<z<<endl;
    }
  cout<<"thank you for playing my game!"<<endl;
  cout<<"this was created by Alexandria Brelsford."<<endl;
  cout<<"on January 29 2019"<<endl;
  
  return 0;
} 

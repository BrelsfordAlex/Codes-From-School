/**
   Learning file io
 */
#include<iostream>//cin and c out
#include<fstream>//file streams
#include<sstream>//string streams
#include<string>
using namespace std;
int main(int argc, char** argv)
{

  //variables
  ifstream inputfile;//input file creating
  string filename;//used to open file
  string fileline;


  //read file name from user
  cout<<"filename= ";
  cin>>filename;


  //open the file
  inputfile.open(&(filename[0]));
  //this is how you open the file
  /**
     You need to always check if the file opened correctly
     using this ifstatement
   */
  if(inputfile.is_open())
    {
      cout<<"File is open"<<endl;
      //this is to get the line and
      //is used if and only if
      //the file can be opened
      //getline(<filename>.<storing>)
      while(getline(inputfile,fileline))
	{
	  cout<<fileline<<endl;
	  //printing the file line 
	}
    }
  else
    {
      cout<<"file is not open"<<endl;
      //many reasons why the file couldnt open
    }
      

      //ending
  inputfile.close();//need to ALWAYS close the file it is a MUST    
  return 0;
}

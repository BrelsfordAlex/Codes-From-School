/**
This is the 4th lab for c++
use to compile 
-std=c++11


I was getting errors like 
Segmentation error and bad allocation and STOI not working 
I worked on this for a very long time and I just could not fix it. I tried my best on the assignment
*/
#include<iostream>//cin and c out
#include<fstream>//file streams
#include<sstream>//string streams
#include<string>
#include<new>//used to fix a bad allocation error
#include<cstdlib>
#include <stdio.h>      /* printf, fgets */
#include <stdlib.h>  

using namespace std;
int main(int argc, char *argv[])
{
  //Variables
  ifstream inputfile;//opening a file
  //ofstream outputfile;//writing to a file
  // stringstream line;//used for line number example
  //string variables
  string filename;//getting the file name
  string fileline;//getting the file lines
  string token;//used for getting the string in a file
  //string outputfile;//getting the output file
  stringstream line;
  //int variables
  int numberofstudents,c,y1,y2,y3,y4=0;  //used for student numbers, total cs classes, and years
  //  double  gpaAvg,gpaMin,gpaMax=0;  //this is to record the average, min and max of the gpa
  int arrayLength1,arrayLength2,arrayLength3,arrayLength4=0; 
  /**
     arraylength1=for student names
     arraylength2 for student id's
     arraylength3 for the gpa's
     arraylength4 for the list of classes
   */

  //code starts
  /**Reading the file name from the user*/
  cout<<"Please type the file name: ";
  cin>>filename;

  /**Opening the File*/
  cout<<" "<<endl;
  cout<<"Reading from the file."<<endl;
  inputfile.open(&(filename[0]));//this is a hack to open the file on school computers
  
 /**Seeing if the the file opened*/
  if(inputfile.is_open())//this is to check if the file opened this is a MUST
    {
      //printing the list of students
      cout<<"Student Data:"<<endl;
      while(getline(inputfile,fileline))
	{
	  /** Reading to a file*/
	  
	  line.str(fileline);
	  getline(line,token,'\t');//'\t'=tab character
	  // cout<<"Name:"<<token<<endl;
	  arrayLength1++;
	  //array1[arraylength1]=token;
	  
	  getline(line,token,'\t');
	  // cout<<"ID Number:"<<token<<endl;
	  arrayLength2++;
	  // array2[arraylength2]=token;
	  
	  getline(line,token,'\t');//'\n' is newline character 
	  // cout<<"Gpa:"<<token<<endl;
	  arrayLength3++;
	    // array3[arraylength3]=token;
	    

	  while(getline(inputfile,fileline,','))
	    {
	      // getline(line,token,',');
	    // cout<<"Classes:"<<token<< endl;
	      arrayLength4=arrayLength4+1; 
	    c++;
	    }
	  cout<<" "<<endl;
	  line.clear();//have this to clear the streamstream=line
	  numberofstudents++;
	}
      
       //Declaring the Arrays
      string* array1;
      string* array2;
      string* array3;
      string* array4;
      array1= new(std::nothrow) string[arrayLength1];//(std thing for fix bad allocation
      array2= new(std::nothrow) string[arrayLength2];
      array3= new(std::nothrow) string[arrayLength3];
      array4= new(std::nothrow) string[arrayLength4];
	
      //adding data to the array
      inputfile.clear();
      inputfile.seekg(0,ios::beg);
   
      while(getline(inputfile,fileline))
	{
	  for(int i=1;i<=arrayLength1;i++)
	    {
	      line.str(fileline);
	      getline(line,token,'\t');//'\t'=tab character
	      array1[i]=token;
	    }
	  for(int i=1;i<=arrayLength2;i++)
	    {
	      line.str(fileline);
	      getline(line,token,'\t');//'\t'=tab character
	      array2[i]=token;
	    }
	   for(int i=1;i<=arrayLength3;i++)
	    {
	      line.str(fileline);
	      getline(line,token,'\t');//'\t'=tab character
	      double ttoken=stod(token);
	      array3[i]=ttoken;
	    }  

	   getline(line,token,'\t');
	  //  cout<<"Year:"<<token<<endl;
	   int  tokenyear=stoi(token);
	   
	  if(tokenyear==1)
	    {
	      y1=y1+1;
	    }
	  else if(tokenyear==2)
	    {
	      y2=y2+1;
	    }
	  else if(tokenyear==3)
	    {
	      y3=y3+1;
	    }
	  else if(tokenyear==4)
	    {
	      y4=y4+1;
	    }
	
	    while(getline(line,token,','))
	      {
		  for(int j=1;j<=c;j++)
		    {
		      array4[j]=token;
		    }
	      }
	}
	    
	 line.clear();//have this to clear the streamstream=line      
	
	  //getting the Max and min GPA
	  // gpaMax=array3[0];
	  //  gpaMin=array3[0];

      //Printing the Final Data
	    cout<<"Final Data"<<endl;
	    cout<<"Number of students in Computer Science Classes:"<<numberofstudents <<endl;
	    cout<<"Students in year 1: "<<y1<<endl;
	    cout<<"Students in year 2: "<<y2<<endl;
	    cout<<"Students in year 3: "<<y3<<endl;
	    cout<<"Students in year 4: "<<y4<<endl;
	    
	    cout<<"Number of Computer Science Courses:"<<c<<endl;
 
    } 
  else
    {
      cout<<"Oopsie file didn't open. Ending the program"<<endl;
    }
  

  //ending the program
  inputfile.close();
  return 0;//always have
}

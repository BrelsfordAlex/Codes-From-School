
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
  stringstream line;//make string if want to use line=stringstream(fileline)
  string token;//used for getting the token(string) in a file
  ofstream outputfile;//writing to a file
  string outputfile;//opening the file your writing to
    
  


  //read file name from user
  cout<<"filename= ";
  cin>>filename;

  cout<<"output file: ";
  cin<<outputfile;

  //open the file
  cout<<" "<<endl;
  cout<<"Reading from a file"<<endl;
  inputfile.open(&(filename[0]));//hack to get this to work(C style )
  //if using up to date only need filename
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
	  /** Reading to a file*/
	  // cout<<fileline<<endl;
	  //printing the file line
	  /**
	     if the line=strongstream doesnt work
	     then you can make line a string stream 
	     then use 
	     line.str(fileline);
	  */
	  // line=stringstream(fileline);
	  cout<<"Student Information"<<endl;
	  line.str(fileline);
	  getline(line,token,'\t');//'\t'=tab character
	  cout<<"Name:"<<token<<endl;

	  getline(line,token,'\t');
	  cout<<"Year:"<<token<<endl;

	  getline(line,token,'\n');//'\n' is newline character 
	  cout<<"Gpa:"<<token<<endl;
	  line.clear();//have this to clear the streamstream=line

	}
    }
  else
    {
      cout<<"file is not open"<<endl;
      //many reasons why the file couldnt open
    }
      
     cout<<" "<<endl;
     cout<<"Writing to a file"<<endl;
     outputfile.open(&(filename[0]));//hack to get this to work(C style )
     if(outputfile.is_open())
       {
	 cout<<"outputfile has opened"<<endl;
	 while(glcout<=10)
	   {
	  line.str(fileline);
	  getline(line,token,'\t');//'\t'=tab character
	  outputfile<<"Name:"<<token<<endl;

	  getline(line,token,'\t');
	  outputfile<<"Year:"<<token<<endl;

	  getline(line,token);//'\n' is newline character 
	  outputfile<<"Gpa:"<<token<<endl;

	  outputfile<<endl;
	  line.clear();//have this to clear the streamstream=line

	  glcout++;
	   }

       }
     else
       {
	 cout<<"file has not opened"<<endl;
       }
  
      //ending
     outputfile.close();   
  inputfile.close();//need to ALWAYS close the file it is a MUST    
  return 0;
}

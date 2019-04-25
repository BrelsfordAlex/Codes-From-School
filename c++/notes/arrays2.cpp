#include<iostream>
using namespace std;
int main(int argc, char** argv)
{

  //variables
  int n;//number of doubles we read from the user
  double* darray;//holds all the doubles
  double avg = 0.0;
  double sum=0.0;
  
    

  //read n from user 
  cout<<"n= ";
  cin>>n;
  cout<<" "<<endl;

  //allocating array
  darray = new double[n];
  //the new operator allows the machine to
  //allocate enough space for n doubles
  //this is how you allocate space

  for(int i=0; i<n;i++)
    {
      cout<<"darray[ "<<i<<"] = ";
      cin>>darray[i];

    }
  //these 2 should be the same
  cout<<"darray[0]= "<<darray[0]<<endl;
  cout<<"*darray= "<<*darray<<endl;
  //since those are the same to print the next one
  //you would do (*darray++)

  /**
  //print the mem address
  cout<<"Mem address of darray[0] "<<endl;
  cout<<darray<<endl;
  */
  
  //seeing if darray[1] and (*darray+1) are the same
  cout<<"darray[1]= "<<darray[1]<<endl;
  cout<<"*darray+1= "<<*(darray+1)<<endl;

  for(int j=0; j<n;j++)
    {
      sum+=darray[j];

    }
  avg=sum/n;
  cout<<"sum of darray= "<<sum<<endl;
  cout<<"avg of darray= "<<avg<<endl;
    
  
  delete[] darray;
  return 0;
}

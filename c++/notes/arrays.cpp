#include<iostream>
using namespace std;
int main()
{
  /**
     Learning about arrays
   */
  //pointers
  //pointer declaring type* [name]
  /**

     Need pointers for arrays
   */
  double* dpointer;
  double test;

  int* ipointer;
  int itest=600;

  
  cout<<"enter a double digit"<<endl;
  cin>>test;
  cout<<"You typed "<<test<<endl;
  dpointer=&test;
  //this helps the pointer to where the test varaible is
  //the & helps give the memory address

  cout<<"dpointer mem location is "<<dpointer<<endl;
  //the cout for dpointer prints the memory location of test

  dpointer=&test;

  cout<<"&test= "<<dpointer<<endl;
  cout<<"changing test with dpointer only"<<endl;
  (*dpointer)++;//adds 1
  cout<<"test= "<<test<<endl;
  cout<<"&test= "<<dpointer<<endl;
  cout<<"*dpointer= "<<*dpointer<<endl;
  //ipointer using
  ipointer=&itest;
  cout<<"itest= "<<itest<<endl;
  cout<<"ipointer= "<<ipointer<<endl;
  cout<<"*ipointer= "<<*ipointer<<endl;//should be the same as the itest

  /**
     drefrence = *ipointer or *dpointe
   */

  itest=( (*ipointer)%3);
  cout<<"itest=((*ipointer)%3)= "<<itest<<endl;
  
  
  return 0;
}  

/**
This is the first program document for learning fuctions in c++
It will cover the basis
Learned on 2/26/19
@author Alex
 */
#include <iostream>
using namespace std;
/**
This fuction will take 3 ints and get the average of the 3 
 */
double average(int x,int y,int z)
{
  double avg;//used for getting average
  avg=(x+y+z)/3.0;//getting the average
  return avg;//using return type
}
/**
This fuction is to get the sum of 2 doubles and then 
print that out. 
Void type needs no return
 */
void printSum(double x, double y)
{
  double result;
  result=x+y;
  cout<<"The sum of "<<x<<"+"<<y<<"="<<result<<endl;
}
/**
this fuction is for just adding 1 to the param added
*/
void inc(int& x)
{
  (x)++;//do not need to derefrence
  //no return needed
}
/**pathtypes*/
//pathtypes are basically the declaration of the fuction
//outside of the main
double averate(int,int,int);
void printSum(double,double);
void inc(int&);
/**
This is the main fuction for the program
*/
int main()
{
  //variables
  double resultavg;//for average fuction
  int v=3;
  int v2=v;//holding original value of V

  //code average
  resultavg=average(v,9,15);
  cout<<"Average is: "<<resultavg<<endl;
  //code inc
   inc(v);
   cout<<"result of "<<v2<<"+ 1"<<"="<<v<<endl;
  
  //using printSum
   printSum(resultavg,v);


}

#include<iostream>//includes the library iostream
using namespace std;//put this there so you don't have to for every c___ line
int main()
{
  double x,y;//declaring variables
  int z,a; //variables for using mod
  
  cout<< "x is ";//cout<< prints what is in the " " to the user
  cin>> x;//cin takes what the user types into a variable
  cout<< "y is ";//prints out using cout<<
  cin>> y;//takes user input and stores in y
  cout<<"z is ";//for mod
  cin>>z;
  cout<< "a is ";//for showing mod
  cin>>a;

  cout<< "showing how to use operators in c++"<<endl;
  cout<< "x * y = "<<(x*y)<<endl;//prints result of x*y
  cout<< " x - y = "<<(x-y)<<endl;//prints x-y
  cout<< " x + y = "<<(x+y)<<endl;//prints x+y
  cout<< "x / y = "<< (x/y)<<endl;//prints x/y
  cout<< "z mod a = "<<(z % a)<<endl;//prints z mod a

  cout<< "showing you can declare a Varable and use operations"<<endl;
  double res;//new variable 
  res = x*x + y*y;//used to show you can store and use operations
  cout<< "x*x +y*y = "<< res<<endl;//showing you can print a var

  cout<<"Showing size of types"<<endl;

  cout<<"Size of Char is "<<sizeof(char)<<endl;
  //sizeof is used to show size of type
  cout<<"Size of int is "<< sizeof(int)<<endl;
  cout<<"size of double is "<<sizeof(double)<<endl;
  
  return 0;//program executed properly
}

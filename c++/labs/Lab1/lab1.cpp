#include<iostream>
using namespace std;
//this is part 1 of the lab
//what this is to do is
// convert a temp from F and turn it int oa temp in C

int main()
{
  double f,c;//f= Farenheight c=Celcius
  double  g,a,r;//used for 5/9 
  
  //user telling program what their temp is
  cout<<"Please input your Farenheit Temperture.";
  cin>>f;//f has the user's temp from Farenheit

  //calculating F--> C
  cout<< "the formula to convert is "<< "(your temp-32)*(5/9)"<<endl;
  g=5;
  a=9;
  r=g/a;

  //calculating the final temp
  
  cout<<f<< " -32 = "<<(f-32)<<endl;
  
  c=(f-32)*r;
  cout<<"finished converting"<<endl;
  cout<<"Original Temp in Farenheit: "<<f<<endl;
  cout<<"New Temp in Celcius: "<<c<<endl;

  return 0;
}

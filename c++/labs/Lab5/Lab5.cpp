/**
This is the assignment Lab5
What I will be doing is writing some utility fuctions 
that will read from the file numbers.dat
and that file will hold some collection of integers 
one on each line by itself
for example 
1
2
3
... and so on
there will me NO MORE than 100 in that document
In this one however there will be 5 functions required
 (and any private helper ones I  want to use)
and then the main
@version 1.0
@date 2/26/19
@author Alex Brelsford
 */
//#includes
#include<iostream>//cin and c out
#include<fstream>//file streams
#include<sstream>//string streams
#include<string>
using namespace std;
//pathtypes(declarations)
int findMin(int[], int);
int findMax(int[], int);
double average(int[], int);
void mySort(int[], int);
void reduce(int[], int);
int arraySum(int[],int);//private 
void arrayCopy(int[],int[],int);//private

//fuctions(required)
/**
This fuction will find the 
max number from an arrray and return it
*/
int findMax(int arr[], int size)
{

  int isMax=0;
  int arraynum=0;
  /**
     The loop will go through each element in the array 
     according to x which will be the sixe
   */
  for(int i=0;i<=size;i++)
    {
      arraynum=i;
      if(arraynum > isMax)
	{
	  isMax=arraynum;//the arr[i] is the new max
	}

    }

  return isMax;//return Max
}

/**
This fuction will find the munumum number in an array
and return it 
*/
int findMin(int arr[],int size)
{
  int arraynum;
  int isMin=0;
  /**
     The loop will go through each element in the array 
     according to x which will be the sixe
   */
  for(int i=0;i<=size;i++)
    {
      arraynum=arr[i];
      if(arraynum < isMin)
	{
	  isMin=arraynum;//if the value is smaller it is put as the min
	}
      else
	{
	  isMin=isMin;//if it isnt smaller the value stays the same
	}
    }

  return isMin;//return min 

}

/**
This fuction will compute the average of all of the numbers 
in the array and return it
 */
double average(int arr[],int size)
{

  //variables needed
  double avgg=0.0;//this will ge used to return the value

  int sum=0;//this is what will be returned

  /**
     This loop will go until i is the size of the array
     adding the array index of i to the sum
   */
  for(int i=0;i<=size;i++)
    {
      sum=sum+arr[i];
    }
  avgg=(sum/size);
  
  return avgg;
}

/**
This fuction will sort the array 
 
void mySort(int arr[], int size)
{
  int* q= subarray;
  int subarray[size];
  
  for(int i=0;i<size;i++)
    {
      if(arr[i] >= subarray[i])
	{
	  subarray[i+1]= arr[i];
	}
      else
	{
	  subarray[i+1]=subarray[i];
	  subarray[i]=arr[i];
	}  
    }
  arrayCopy(arr[],subarray[],size);
  
}


This fuction will return nothing due to the void type 
but it will reduce each element in the array by mod2(%2) 
and then replace the value%2

void reduce(int arr[], int x)
{


}

//non-required fuctions



   this function will take in 2 arrays of equal size
 and copy the second one to the first one
 
void arrayCopy(int arr[],int arr2[],int size)
{
  //while the i is not the size
  //it will copy the elements from arr2[] into arr[]
  for(int i=0;i<size;i++)
    {
      arr[i]=arr2[i];
    }  
  
}

//-----------------------------------------------------------


This is the main fuction
*/
//#includes
#include<iostream>//cin and c out
#include<fstream>//file streams
#include<sstream>//string streams
#include<string>
using namespace std;
int main()
{

  //variables
  int size=10;
  int array[10]={1,11,22,33,44,55,66,77,88,99};
  int maxnum;
   maxnum= findMax(array,size);
   cout<<"Max is: "<<maxnum<<endl;

   int minnum;
minnum=findMin(array,size);
     cout<<"Min num: "<<minnum<<endl;

   double avgnum;
   avgnum=average(array,size);
cout<<"Average is: "<<avgnum<<endl;

   
  return 0;
}

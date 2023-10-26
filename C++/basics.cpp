#include <iostream>

using namespace std;

int main()
{
    cout<<"Hello World\n";
    
    // Variable declaration
    int a,b,sum;
    cout<<"Enter a integer 1: ";
    // Taking input
    cin>>a;
    cout<<"Enter integer 2: ";
    cin>>b;
    //Arithmetic operation
    sum = a+b;
    // Printing a variable
    cout<<"Sum is " << sum<<"\n";
    
    //Array initialization
    int arr[5] = {1,2,3,4,5};
    //For loop
    for(int i=0; i<5; i++){
     cout<<arr[i]<<"\n";   
    }
    //String initialization
char arr1[6] = "Hello";
    for(int i=0; i<5; i++){
     cout<<arr1[i];   
    }
    return 0;
}

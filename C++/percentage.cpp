#include <iostream>
#include <iomanip>
using namespace std;

int main ()
{
	cout<<"Enter your name: ";
	string Name;
	cin>>Name;

    cout<<"Enter total marks of the paper: "<<endl;
	float p;
	cin>> p;
    
    	p = 100/p;
    
	cout<<"Enter your Mathematics marks: "<<endl;
	int a;
	cin>> a;

	cout<<"Enter your Physics marks: "<<endl;
	int b;
	cin>> b;

	cout<<"Enter your Chemistry marks: "<<endl;
	int c;
	cin>> c;

	double Percentage;
	Percentage= (a+b+c)/3 * p;

	cout<<Name<<" Your Percentage is approximately"<<setprecision (15)<<Percentage<<"%";
}

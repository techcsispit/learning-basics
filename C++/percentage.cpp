#include <iostream>

using namespace std;

int main() {
  
  string name;
  int a, b, c;
  double percentage;

 
  cout << "Enter your name: ";
  cin >> name;

  cout << "Enter your Mathematics marks: ";
  cin >> a;

  cout << "Enter your Physics marks: ";
  cin >> b;

  cout << "Enter your Chemistry marks: ";
  cin >> c;

  percentage = (a + b + c) / 3.0;

  cout << name << " Your Percentage is " << percentage << "%";

  return 0;
}

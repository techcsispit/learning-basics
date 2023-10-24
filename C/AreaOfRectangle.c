#include <stdio.h>

// Area of Rectangle
int main() {
  float l, b;

  printf("Enter the Length of the Rectangle: ");
  scanf("%f", &l);

  printf("Enter the Breadth of the Rectangle: ");
  scanf("%f", &b);

 
  if (l < 0 || b < 0) {
    printf("Invalid input. The length and breadth must be positive .\n");
    return 1;
  }


  printf("The Area of the Rectangle is: %f\n", l*b);

  return 0;
}

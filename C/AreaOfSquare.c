
#include <stdio.h>
// Area of Square
int main() {
  float a;

  printf("Enter the side of the Square: ");
  scanf("%f", &a);

  if (a < 0 ) {
    printf("Invalid input. The side of the Square must be positive.\n");
    return 1;
  }
printf("The Area of the Square is: %f\n", a*a);

  return 0;
}

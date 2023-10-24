#include <stdio.h>
#include <math.h>

// Area of Circle
int main() {
  float r;

  printf("Enter the Radius of the Circle: ");
  scanf("%f", &r);

  printf("The Area of the Circle is %f",  M_PI * r * r);

  return 0;
}

#include <stdio.h>
#include <math.h>

int main() {
  double p, r, n;
  printf("Enter Principal Amount: ");
  scanf("%lf", &p);
  printf("Enter Rate of Interest: ");
  scanf("%lf", &r);
  printf("Enter Number of Years: ");
  scanf("%lf", &n);
  double variable = pow(1 + r, n);
  printf("EMI is %lf", (p * r * variable) / (variable - 1));
  return 0;
}

#include <stdio.h>
#include <math.h>

int pow(int base, int exponent, int num_digits) {
  int result = 1;
  for (int i = 0; i < exponent; i++) {
    result *= base;
  }
  return result;
}

int main() {
  int num, n = 0, sum = 0;
  printf("Enter a Number: ");
  scanf("%d", &num);
  int num2 = num;
  int finnumcheck = num;

  while (num2 != 0) {
    num2 /= 10;
    n++;
  }
  while (num != 0) {
    int x = num % 10;
    sum += pow(x, n, n);
    num /= 10;
  }
  if (finnumcheck != sum) {
    printf("%d is not an Armstrong Number\n", finnumcheck);
  } else {
    printf("%d is an Armstrong Number\n", finnumcheck);
  }

  return 0;
}

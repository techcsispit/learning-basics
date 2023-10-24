#include<stdio.h>
int factorial_lookup_table[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

int fact(int num) {
  if (num < 10) {
    return factorial_lookup_table[num];
  } else {
    return num * fact(num - 1);
  }
}

int main() {
  int num;
  printf("Enter number for factorial: ");
  scanf("%d", &num);

  if (num >= 0) {
    int f = fact(num);
    printf("Factorial is: %d\n", f);
  } else {
    printf("Factorial of a negative number does not exist\n");
  }

  return 0;
}

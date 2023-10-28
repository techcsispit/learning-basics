#include <stdio.h>
#include <math.h>

int main() {
  int a, b;
  double power;
  char c;

  printf("Enter number 1: ");
  scanf("%d", &a);
  printf("Enter number 2: ");
  scanf("%d", &b);
  printf("Enter operator: ");
  scanf("%c", &c);

  switch (c) {
    case '+':
      printf("%d", (a + b));
      break;
    case '-':
      printf("%d", (a - b));
      break;
    case '*':
      printf("%d", (a * b));
      break;
    case '/':
      if (b == 0) {
        printf("Cannot divide by 0");
        break;
      }
      printf("%d", (a / b));
      break;
    case '^':
      power = (double)b;
      printf("%d", (int)pow((double)a, power));
      break;
    default:
      printf("Enter valid operator");
      break;
  }

  return 0;
}

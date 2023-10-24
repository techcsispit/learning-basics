#include<stdio.h>

int fact(int num);
int fact (int num){
  if(num<=1){
    return 1;
  } else {
    return num*fact(num-1);
  }
}

int main ()
{
  int num;
  printf ("Enter number for factorial \n");
  scanf ("%d", &num);
  if(num>=0){
    int f= fact (num);
    printf("Factorial is: %d",f);
  } else {
    printf("Factorial of a negative number does not exist");
  }
  return 0;
}

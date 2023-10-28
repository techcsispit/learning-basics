#include <stdio.h>
#include <string.h>

int main() {
  char str[100];
  int i = 0, j = 0;

  printf("Enter the string: \n");
  scanf("%[^\n]", str);

  // Check if the string is empty.
  if (strlen(str) == 0) {
    printf("The string is empty.\n");
    return 0;
  }

  j = strlen(str) - 1;
  while (str[j] == ' ') {
    j--;
  }

  int q = j;
  for (int p = 0; p < j / 2; p++) {
    if (str[p] != str[q]) {
      printf("Not palindrome.\n");
      return 0;
    }
    q--;
  }

  printf("Palindrome.\n");
  return 0;
}

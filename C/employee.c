# include<stdio.h>
void swap(int* xp, int* yp)
 {
  int temp = *xp;
  *xp = *yp;
  *yp = temp;
}

void bubbleSort(int arr[][2], int n)
 {
  int i, j;
  for (i = 0; i < n - 1; i++) {
for (j = 0; j < n - i - 1; j++) {
      if (arr[j][1] > arr[j + 1][1]) {
        swap(&arr[j][1], &arr[j + 1][1]);
        swap(&arr[j][0], &arr[j + 1][0]);
      }
    }
  }
}

int main() {
  int n, year;
  printf("Enter the Current Year: ");
  scanf("%d", &year);
  printf("Enter the Number of Employees: ");
  scanf("%d", &n);
  int emp[n][2];
  for (int i = 0; i < n; i++) {
    int age = 0;
    printf("Enter Details of Emp%d: ", i + 1);
    scanf("%d %d", &emp[i][0], &age);
    emp[i][1] = year + 65 - age;
  }

  bubbleSort(emp, n);

  int current_retirement_year = emp[0][1];
  printf("\n==> The Employee Table \n(ID, RetirementYear)\n");
  for (int i = 0; i < n; i++) {
    if (emp[i][1] != current_retirement_year) {
      printf("\n");
      current_retirement_year = emp[i][1];
    }
    printf("%4d %4d\n", emp[i][0], emp[i][1]);
  }

  return 0;
}

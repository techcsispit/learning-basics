#include <stdio.h>

int main()
{
    // Declare Variables to store no. of paise for each value
    unsigned long n50, n25, n20, n10, n5;
    printf("Enter No. of 50 paise: ");
    scanf("%lu", &n50);
    printf("Enter No. of 25 paise: ");
    scanf("%lu", &n25);
    printf("Enter No. of 20 paise: ");
    scanf("%lu", &n20);
    printf("Enter No. of 10 paise: ");
    scanf("%lu", &n10);
    printf("Enter No. of 5 paise: ");
    scanf("%lu", &n5);
    // Calculating Total Money
    unsigned long int total_money = n50 * 50 + n25 * 25 + n20 * 20 + n10 * 10 + n5 * 5;
    printf("\nTotal Money in Piggy Bank is: %lu\n", total_money);
    return 0;
}
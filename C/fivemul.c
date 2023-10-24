#include <stdio.h>
int c;
int flag;
int pattern(int n)
{
    if(n > 0 && flag == 0)
    {
        printf("%d ", n);
        pattern (n - 5);
        
    }
    else if (n <= c)
    {
        printf("%d ", n);
        flag = 1; 
        pattern (n + 5);
    }
}
int main()
{
    int n;
    printf("Enter the value of n \n");
    scanf("%d", &n);
    c = n;
    pattern(n);
}




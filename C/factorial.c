#include <stdio.h>
long long int factorial(int n)
{
    long long ans = 1;
    int i;
    for(i=1; i <= n; i++)
    ans *= i;
    return ans;
}

int main()
{
    int n;
    printf("Enter the number whose factorial is to be found \n");
    scanf("%d",&n);
    if(n<0){
        printf("Factorial of a negative number does not exist \n");
    }
    else{
        printf("%lld\n", factorial(n));
    }
    return 0;
}

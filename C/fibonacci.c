#include <stdio.h>

int fibo(int n){
if (n==1 || n==2){
	return 1;
}
	return fibo(n-1)+fibo(n-2);
}

int main() {
    int n;
    printf("Enter N: ");
    scanf("%d", &n);
	if(n<1){
		printf("error\n");
		return 1;
	}
    int ans = fibo(n);
    printf("==> %dth Fibonacci Number: %d\n", n, ans);
    return 0;
}

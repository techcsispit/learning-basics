#include <stdio.h>

int fibo(int n){
	int fib[n];
	fib[0]=0;
	fib[1]=1;
	for(int i=2;i<n;i++){
		fib[i]=fib[i-1]+fib[i-2];
	}
	return fib[n-1];
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

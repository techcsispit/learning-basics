#include <stdio.h>

int isprime(int n){
	if (n==1 || n==0 || n<0){
		return 0;
	}
	if(n==2){
		return 1;
	}else{
		for(int i=2; i<=(n/2); i++){
			if (n%i==0){
				return 0;
			}
		}
	}
	return 1;
}



void prime(int a, int b){
	int c = a - (a%10) + 1;
	for(c; c<a; c++){
		printf("      ");
	}
	for(a; a<=b; a++){
		if(isprime(a) == 1){
			printf("%5d*", a);
		}else if(a%10==0){
			printf("%5d \n", a);
		}else{
			printf("%5d ", a);
		}
	}
}

void main(){
	int a, b;
	printf("Enter lower bound: ");
	scanf("%d",&a);
	printf("Enter upper bound: ");
	scanf("%d",&b);
	prime(a, b);
}

#include <stdio.h>

int prime(int n){
    if (n==0 || n==1){
        return 0;
    }
    for (int i=2;i<n/2;i++){
        if(n%i==0){
            return 0;
        }
    }
    return 1;
}

int main(){
	int a, b;
	printf("Enter the Range to find twin primes: ");
	scanf("%d %d", &a, &b);
	// making a odd since the twin odds are all consecutive odd nums
	if (a%2==0){
		a++;	
	}else if(a == 1){
		a+=2;	
	}
	// traversing among the odd numbers to see if they are primes
	while (a<b-2){
		if (prime(a) == 1 && prime(a+2) == 1){ // consecutive odd primes
			printf("(%d, %d)\n", a, a+2);
		}
		a+=2;
	}
	printf("are the only twin primes present in this range\n");
}

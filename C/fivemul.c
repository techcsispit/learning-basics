#include <stdio.h>

void five(int n){
	if(n>0){
		return;
	}
	printf("%d\t", n);
		five(n-5);
	printf("%d\t", n);	
}
int main(){
	int n;
	printf("Enter N: ");
	scanf("%d", &n);
	five(n);
	printf("\n");
}

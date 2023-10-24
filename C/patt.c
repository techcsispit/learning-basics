# include <stdio.h>

void pattern(int n){
	for(int i=0; i<(n); i++){
	    for(int j=0; j<(n); j++){
	        if(i==0 || i==(n-1)){
	            printf("* ");
	        }
	        else{
	            if(j==0 || j==(n-1)){
	               printf("* "); 
	            }
	            else{
	                printf("  ");
	            }
	        }
	    }
	    printf("\n");
	}
}

int main(){
    printf("Program to draw square of given side\n");
	int n;
	printf("Enter N: ");
	scanf("%d", &n);
	pattern(n);
	printf("\n");
}

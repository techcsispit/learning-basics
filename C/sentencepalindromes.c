#include <stdio.h>
#include<string.h>

int main(){
    char str[100];
    int i = 0, j = 0;
    printf("Enter the string: \n");
    scanf("%[^\n]", str);

     j = strlen(str);
     if(str[j-1]==' '){
         j--;
     }
    
    int q = (j-1);
    for(int p=0; p<j; p++){
        if(str[p]!=str[q]){
            printf("Not palindrome");
            return 0;
        }
        else{
            q--;
        }
    }
    printf("Palindrome");
    return 0;
}

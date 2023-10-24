# include <stdio.h>
# include <math.h>

int main(){
    int a, b;
    char c;
    printf("Enter number 1: ");
    scanf("%d",&a);
    printf("Enter number 2: ");
    scanf("%d",&b);
    printf("Enter operator: ");
    scanf("%c",&c);
    scanf("%c",&c);
    printf("Result: ");
    switch(c){
    case '+':
        printf("%d",(a+b));
        break;
    case '-':
        printf("%d",(a-b));
        break;
    case '*':
        printf("%d",(a*b));
        break;
    case '/':
        if(!b){
            printf("Cannot divide by 0");
            break;
        }
        printf("%d",(a/b));
       break;
    case '^':
        printf("%d",(int)pow((double)(a), (double)(b)));
        return (int)(pow((double)(a), (double)(b)));
    default:
        printf("Enter valid operator");
        break;
    }
    
    return 0;
}

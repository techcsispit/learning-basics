#include<stdio.h>
#include<math.h>
int main ()
{
    float a,b,c,s,ar;
    printf("Enter 3 sides \n");
    scanf("%f",&a);
    scanf("%f",&b);
    scanf("%f",&c);
    if(a<0||b<0||c<0)
    printf("Invalid input for side of a triangle");
    else{
    s=(a+b+c)/2;
    ar=sqrt(s*(s-a)*(s-b)*(s-c));
    printf("Area = %f",ar);
    }
    return 0;
}

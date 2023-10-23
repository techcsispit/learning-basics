#include <stdio.h>
// Area of Triangle
int main(){
    float b, h;
    printf("Enter the Base of the Triangle: ");
    scanf("%f", &b);
    printf("Enter the Height of the Triangle: ");
    scanf("%f", &h);
    if (l < 0 || b < 0) {
    printf("Invalid input. The Height and Base must be non-negative values.\n");
    return 1;
  }
    printf("The Area of the Triangle is %f", 0.5*b*h);
}

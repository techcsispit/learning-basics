#include <stdio.h>
// Perimeter of Rectangle
int main() {
    float l, b;
    printf("Enter the Length of the Rectangle: ");
    scanf("%f", &l);
    printf("Enter the Breadth of the Rectangle: ");
    scanf("%f", &b);
    if(l<0 || b<0) {
        printf("Invalid input as the length and breadth of a rectangle must be a non-negative values");
        return 1;
    }
    printf("The Perimeter of the Rectangle is %f", 2*(l+b));
}

#include <stdio.h>
// Perimeter of Square
int main() {
    float side;
    printf("Enter the side of the Square: ");
    scanf("%f", &side);
    if(side<0) {
        printf("Invalid input as the side of a square must be a non-negative value");
    }
    printf("The Perimeter of the Rectangle is %f", 4*side);
}

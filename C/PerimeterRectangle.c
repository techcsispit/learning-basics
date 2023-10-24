#include <stdio.h>
// Perimeter of Square
int main() {
    float a;
    printf("Enter the Side of the Square: ");
    scanf("%f", &a);
    if(a<0){
        printf("Invalid input side of a square must be a non-negative value");
        return 1;
    }
    printf("The Perimeter of the Square is %f", 4*a);
}

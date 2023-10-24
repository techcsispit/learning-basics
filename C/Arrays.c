#include <stdio.h>
#include <conio.h>
int inp(int index){
    int val;
    printf("Enter %d number in the array: ", index);
    scanf("%d", &val);
    return val;
}
int main(){
    // there are no strings in C. Only character array
    // just change the datatype below to make an array
    // of one type values/elements
    int array[5] = {0, 0, 0, 0, 0};
    for(int i=0; i<5; i++){
    array[i] = inp(i);
    }
    printf("[%d, ", array[0]);
    for(int i=1; i<4; i++){
        printf("%d, ", array[i]);
    }
    printf("%d]", array[4]);
    return 0;
}

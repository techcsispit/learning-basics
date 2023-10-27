#include<bits/stdc++.h>
using namespace std;

int main(){
    // int arr[] = {1, 2, 3, 4, 5};
    int arr[] = {2, 4, 5, 7, 9, 11, 14, 15 ,20 ,22 ,23, 24, 25, 26, 27, 28, 32, 33, 36, 37, 39, 41, 42, 43, 44, 45, 47, 48, 49, 50, 51, 53, 54, 55, 57, 59, 60, 61, 62, 63, 66, 67, 68, 69, 70, 71, 72, 73, 74, 76, 78, 86, 87, 89, 91, 93, 94, 95, 97, 100};
    // cout<<(sizeof(arr)/sizeof(arr[0]));
    int n = sizeof(arr)/sizeof(arr[0]);
    int k = 2, left = 0;
    int right = n-1; 
    while(left <= right){
        int mid = (left+right)/2;
        if(k == arr[mid]){
            cout<<"The element is present at position : "<<mid<<endl;
            return mid;
        }
        else if(k < arr[mid]) 
            right = mid - 1;
        else 
            left = mid + 1;
    }
    cout<<"not found";
    return 0;
}
#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    for (int i = 0; i < n; i++){
        for (int j = 0; j <= i; j++)
        {
            cout<<"*";
        }
        int space = 2*n-2*i-1;
        for (int i = 0; i < space-1; i++)
        {
            cout<<" ";
        }
        for (int j = 0; j <= i; j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    for (int i = n-2; i >= 0; i--){
        for (int j = 0; j <= i; j++)
        {
            cout<<"*";
        }
        int space = 2*n-2*i-1;
        for (int i = 0; i < space-1; i++)
        {
            cout<<" ";
        }
        for (int j = 0; j <= i; j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    return 0;
}
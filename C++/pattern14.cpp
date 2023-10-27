#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    for (int i = 1; i <= n; i++){
        for(int k = 0; k < n-i; k++){
            cout<<"  ";
        }
        for (int l = 0; l < i; l++){
            cout<<i<<" ";
        }
        cout<<endl;
    }
        cout<<endl;
    return 0;
}
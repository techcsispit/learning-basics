#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, count = 0;
    char c;
    cin>>n;
    for (int i = 0; i < n; i++){
        count = i;
        for (int j = 0; j < n; j++){
            c = char(65+count);
            cout<<c<<" ";
            count++;
        }
        cout<<endl;
    }
    
    return 0;
}
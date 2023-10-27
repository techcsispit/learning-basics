#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    char c;
    cin>>n;
    for (int  i = 1; i <= n; i++)
    {
        for (int j = 0; j<=i-1 ; j++)
        {
            c = char(65+n-i+j);
            cout<<c<<" ";
        }
        cout<<endl;
    }
    return 0;
}
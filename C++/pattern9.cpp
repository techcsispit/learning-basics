#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    char c;
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            c = char(65+i); 
            cout<<c<<" ";
        }
        cout<<endl;
    }
    cout<<endl<<endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            c = char(65+j); 
            cout<<c<<" ";
        }
        cout<<endl;
    }
    return 0;
}
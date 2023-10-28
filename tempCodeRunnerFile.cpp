#include<bits/stdc++.h>
using namespace std;

int main(){
    int a;
    cin>>a;
    cout<<endl;
    for (int i = 0; i < a; i++)
    {
        for (int j = 0; j < a; j++)
        {
            if(i==0 || j==0 || j==a-1 || i==a-1) cout<<"* ";    
            else cout<<"  ";   // putting space here makes it look more like a square 
        }
        cout<<endl;
    }

    return 0;
}
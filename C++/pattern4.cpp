#include<bits/stdc++.h>
using namespace std;

int main(){
    int a;
    
    cin>>a;
    cout<<endl;
     int sum = 0;       //sum to find the last number which would be printed 
    int dig = 0;        //dig to find no of digits
    int dig2=0;         //duplicate of digits 
  
   for(int i=1;i<=a;i++)     // to find the last number 
   {
        sum+=i;
   }

   while(sum!=0)                 // to find no of digits 
   {
        sum=sum/10;
        dig2++;
   }


    int count = 1;

    for (int i = 1; i <= a; i++)
    {
        for (int j = 1; j <= i; j++)
        {
           
            int num = count;
             cout<<count;
            while(num!=0)             // to check no of digits in each printed count 
            {
                num = num/10;
                dig++;
            }

            int l = dig2-dig+1;

            dig=0;

            while(l!=0)                  // to add spaces appropriately 
            {
                cout<<" ";
                l--;
                

            }

           
            count ++;


            
        }

        
        cout<<endl;
    }

    return 0;
}

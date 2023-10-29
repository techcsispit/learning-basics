#include <stdio.h>
int search(int arr[], int n, int lim){
	n-=lim;
    for(int i=0; i<lim; i++){
        if(n==arr[i]){
            return 0; 
        }
    }
    return 1;
}
 
int recaman(int n, int arr[]){
    if(n==0){
        return 0;
    }else if(recaman(n-1, arr)>n && search(arr, recaman(n-1, arr), n)==1){
        return recaman(n-1, arr)-n;
    }else{
        return recaman(n-1, arr)+n;
    }
}

int main() {
    int n;
    printf("Enter N: ");
    scanf("%d", &n);
    /*int arr[n];
    printf("First %d terms of Recaman Series are ", n);
    for(int i = 1; i<=n; i++){
        int ans = recaman(i, arr);
        arr[i]=ans;
        printf("%d ", ans);
    }
    printf("\n");
    return 0;*/
    int curr=1;
    int terms[n];
    terms[0]=1;
    printf("%d\t",curr);
    for(int i=2;i<=n;i++){
        if(i==2){
            curr = 3;
            terms[i-1]=curr;
        } else if((curr - i)<=0){
            int flag=1;
            for(int j=0;j<n;j++){
                if(terms[j]==curr-i && curr-i!=0){
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                curr=curr+i;
            } else {
                curr = curr-i;
            }
            terms[i-1] == curr;
        } else {
            curr = curr-i;
            terms[i-1]=curr;
        }
        printf("%d\t",curr);
    }
    return 0;
}

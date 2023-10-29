#include <stdio.h>
void displayMat(int arr[][10],int r,int c)
{
for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }
}
void readMat(int a[][10],int r,int c)
{
    printf("Enter the elements in a row wise format \n");
for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d", &a[i][j]);
        }
    }
}
void mul(int a[][10], int b[][10],int r1,int r2,int c1,int c2)
{
  int res[r1][c2];
  printf ("Multiplication of given two matrices is:\n");
  for (int i = 0; i < r1; i++){
      for (int j = 0; j < c2; j++){
    	    res[i][j] = 0;
    	    for (int k = 0; k < r2; k++){
    	      res[i][j] += a[i][k] * b[k][j];
    	    }
    	    printf ("%d ", res[i][j]);
    	}
      printf ("\n");
    }
}


int main()
{
    int a[10][10],b[10][10],res[10][10],rows,cols,rows1,cols1;
    printf("Enter rows of matix less than 10 \n");
    scanf("%d",&rows);
    printf("Enter columns of matix less than 10 \n");
    scanf("%d",&cols);
    readMat(a,rows,cols);
    
    printf("Enter rows of matix less than 10 \n");
    scanf("%d",&rows1);
    printf("Enter columns of matix less than 10 \n");
    scanf("%d",&cols1);
    readMat(b,rows1,cols1);
    if(cols==rows1){
        mul(a,b,rows,rows1,cols,cols1);
    }
    else {
        printf("The matrix cannot be multiplied");
    }
    return 0;
}


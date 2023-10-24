#include <stdio.h>

void elem(int r1,int r2,int c1,int c2){
    int mat1[r1][c1];
    int mat2[r2][c2];
    int mat3[r1][c1];
    
    printf("\nenter elements for 1st matrix(like a matrix) \n");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            scanf("%d",&mat1[i][j]);
            
            
        }
    }
     printf("\n enter elements for 2nd matrix(like a matrix) \n");
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            scanf("%d",&mat2[i][j]);
            
            
        }
    }
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
            mat3[i][j]=0;
        }
    }
  
  if(c1==r2)
{
    for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
        for(int t=0;t<c1;t++){
         mat3[i][j]=mat3[i][j]+(mat1[i][t])*(mat2[t][j]);   
        }
    }
    
}
printf(" \n product is \n ");
for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            printf("%d ",mat3[i][j]);
        }
        printf("\n");}
}
        
}


int main()
{int r1,r2,c1,c2;
     printf("enter row and column for 1st");
    scanf("%d %d",&r1,&c1);
    printf(" \nenter row and column for 2nd");
    scanf("%d %d",&r2,&c2);
if(c1==r2){

    elem( r1, r2, c1, c2);
    
    }
else{
printf("error,cannot multiply the 2 matrices");
}
    
}
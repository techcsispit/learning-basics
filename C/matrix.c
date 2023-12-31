#include <stdio.h>
#include <stdlib.h>
#include <math.h>

// Function to print a Matrix
void print2DArray(int rows, int cols, int m[rows][cols])
{
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("%d ", m[i][j]);
        }
        printf("\n");
    }
}

// Function to take input in a Matrix
void input2DArray(int rows, int cols, int arr[rows][cols])
{
    printf("Enter the elements of the 2D array:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("Enter element arr[%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }
    printf("==> The Matrix: \n");
    print2DArray(rows, cols, arr);
}

// Function to add two Matrices
void add(int rows, int cols, int a[rows][cols], int b[rows][cols])
{
    int c[rows][cols];

    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            c[i][j] = a[i][j] + b[i][j];

    printf("\n==> Addition of matrices: \n");
    print2DArray(rows, cols, c);
}

// Function to subtract two Matrices
void subtract(int rows, int cols, int a[rows][cols], int b[rows][cols])
{
    int c[rows][cols];

    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            c[i][j] = a[i][j] - b[i][j];

    printf("\n==> Subtraction of matrices: \n");
    print2DArray(rows, cols, c);
}

// Function to multiply two Matrices
void multiply(int rows, int cols, int a[rows][cols], int b[rows][cols])
{
    if (rows != cols)
    {
        printf("\n==> Multiplication is not possible...\n");
        return;
    }

    int c[rows][cols];
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            c[i][j] = 0;

    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            for (int k = 0; k < cols; k++)
                c[i][j] += a[i][k] * b[k][j];

    printf("\n==> Multiplication of matrices: \n");
    print2DArray(rows, cols, c);
}

// Function to calculate Norm of a Matrix
double norm(int rows, int cols, int matrix[rows][cols])
{
    double norm = 0;
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            norm += matrix[i][j] * matrix[i][j];

    return sqrt(norm);
}

// Function to print Transpose of a Matrix
void transpose(int rows, int cols, int matrix[rows][cols], int transposedMatrix[cols][rows])
{
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            transposedMatrix[j][i] = matrix[i][j];

    printf("\n==> Transposition of matrix: \n");
    print2DArray(cols, rows, transposedMatrix);
}

int main()
{
    int rows, cols;
    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    int A[rows][cols];
    input2DArray(rows, cols, A);
    int B[rows][cols];
    input2DArray(rows, cols, B);

    int norma = norm(rows, cols, A);
    int normb = norm(rows, cols, B);
    printf("==> Norm of A = %d\n", norma);
    printf("==> Norm of B = %d\n", normb);

    int transA[rows][cols];
    int transB[rows][cols];
    printf("==> Transpose of A: ");
    transpose(rows, cols, A, transA);
    printf("==> Transpose of B: ");
    transpose(rows, cols, B, transB);

    add(rows, cols, A, B);
    subtract(rows, cols, A, B);
    multiply(rows, cols, A, B);
}

#include <stdio.h>

int isSymmetric(int n, int mat[][n]){
    for(int i =0; i<n; i++){
        for(int j = 0; j<n; j++){
            if(mat[i][j] != mat[j][i]){
                return 0;
            }
        }
    }
    return 1;
}

int main(){
    int n;
    printf("Enter the size of the square matrix: ");
    scanf("%d",&n);

    int mat[n][n];
    printf("Enter the elements of the matrix:\n");
    for(int i = 0; i<n; i++){
        for(int j=0; j<n; j++){
            scanf("%d", &mat[i][j]);
        }
    }
    if (isSymmetric (n, mat)){
        printf("The matrix is symmetric. \n");
    }else{
        printf("The matrix is not symmetric. \n")
    }
    return 0;
}
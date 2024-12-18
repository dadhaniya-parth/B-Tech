// 30. Read two 2x2 matrices and perform addition of matrices into third matrix and print it.

import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int[][] matrix1=new int[2][2];
       int[][] matrix2=new int[2][2];
       int[][] ans=new int[2][2];
       System.out.println("enter value of first matrix"); 
       for (int i = 0; i < 2; i++) {
           for(int j=0;j<2;j++){
            matrix1[i][j]=sc.nextInt();
           }
       }
       System.out.println("enter value of second matrix");
       for (int i = 0; i < 2; i++) {
        for(int j=0;j<2;j++){
         matrix2[i][j]=sc.nextInt();
        }
    }
    for (int i = 0; i < 2; i++) {
        for(int j=0;j<2;j++){
         ans[i][j]=matrix1[i][j]+matrix2[i][j];
        }
    }
    System.out.println("Addition of two matrix is:");
    for (int i = 0; i < 2; i++) {
        for(int j=0;j<2;j++){
        System.out.print(ans[i][j]+" ");
        }
        System.out.println("\n");
    }

    }
}
// 31. Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in third matrix and print it.

import java.util.Scanner;

public class MultiplicationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][2];
        int[][] matrix2 = new int[2][3];
        int[][] ans = new int[3][3];
        System.out.println("enter value of first matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter value of second matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               for(int k=0;k<2;k++){
                ans[i][j]+=matrix1[i][k]*matrix2[k][j];
               }
            }
        }
        System.out.println("Multiplication is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

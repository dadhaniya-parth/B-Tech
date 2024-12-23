// 25. Write a program to delete duplicate numbers from an array.

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] duplicate=new int[size];
        int index=0,count=0;
        System.out.println("enter sorted value:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(i!=j){
                    if (arr[i]==arr[j]) {
                        duplicate[index]=arr[i];
                        index++;
                    }
                }
            }
        }
        for(int i=0;i<index;i++){
        while(duplicate[i]!=arr[count]){
            count++;
           
        }
        size--;
        for(int k=count;k<size;k++){
            arr[k]=arr[k+1];
           

        }
        count=0;
    }
    System.out.println("New Array:");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    }
}

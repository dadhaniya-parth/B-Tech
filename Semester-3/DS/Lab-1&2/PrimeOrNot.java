//8. w.a.p. to find whether number is prime or not.

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            } 
        }
        if (count==2) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Not Prime");
        }
    }
}

// 11. w.a.p. to find sum of 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...n).

import java.util.*;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum = sum + i;
            }
        }
        System.out.println("Sum is:"+sum);
    }
}

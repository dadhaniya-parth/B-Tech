import java.util.*;
public class Patten8 {
    public static void main(String[] args) {
        int n,number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

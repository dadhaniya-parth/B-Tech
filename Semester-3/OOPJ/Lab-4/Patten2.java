import java.util.*;
public class Patten2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}

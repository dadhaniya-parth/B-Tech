import java.util.*;
public class Patten10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows:");
		int n = sc.nextInt();
		for (int i = 1 ; i <= n; i++ ) 
		{
			for (int j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (int k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = n - 1 ; i > 0; i-- ) 
		{
			for (int j = 1 ; j <= n - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (int k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}

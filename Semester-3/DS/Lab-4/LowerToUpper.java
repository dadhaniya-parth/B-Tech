// 27. WAP to replace lowercase characters by uppercase & vice-versa in a user specified string.

import java.util.*;
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String n = sc.next();
        String ans = "";

        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)>=97 && n.charAt(i)<=122)
            {
                ans += (char) (n.charAt(i) - 32);
            }
        }
        System.out.println(ans);
    }
}

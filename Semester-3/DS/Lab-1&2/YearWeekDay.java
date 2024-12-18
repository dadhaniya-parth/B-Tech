// 10. w.a.p. to convert numbers of days into year,week & days.[e.g. 375 days mean 1 year,1 week & 3 days].

import java.util.*;
public class YearWeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days:");
        int d = sc.nextInt();
        int y = d / 365;
        d = d % 365;
        int w = d / 7;
        d = d % 7;
        System.out.println(y+":"+w+":"+d);
    }
}

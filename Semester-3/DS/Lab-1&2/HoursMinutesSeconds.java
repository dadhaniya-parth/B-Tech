// 9. WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS [e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].

import java.util.*;
public class HoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Second:");
         int s = sc.nextInt();
         int h = s / 3600;
         s = s % 3600;
         int m = s / 60;
         s = s % 60; 
         System.out.println(h+":"+m+":"+s);
    }
}
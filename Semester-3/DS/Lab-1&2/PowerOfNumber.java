//6. w.a.p. to find power of a number using loop.

import java.util.*;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and Power:");
        int base = sc.nextInt();
        int power = sc.nextInt();
        int ans = 1;
        for(int i=0;i<power;i++){
            ans=ans*base;
        }
        System.out.println("Power is:"+ans);
    }
}

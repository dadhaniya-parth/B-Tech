// 3. Write a java program to take user input
// ii. through Scanner class.[A]

import java.util.*;
public class InputObject{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = s.nextLine();
        System.out.println("Enter Roll:");
        int roll = s.nextInt();
        System.out.println("Name is:"+name);
        System.out.println("Roll is:"+roll);
    }
}
// 35. Create array of object of class Student_Detail with attributes Enrollment_No, Name, Semester, CPI for 5 students, 
// scan their information and print it.

import java.util.*;

 class Student_Detail{
    int Enrollment_No;
    String Name;
    int Semester;
    double cpi;
    Scanner sc=new Scanner(System.in);
    void readdtl(){
        System.out.println("enter enrollment no:");
        Enrollment_No=sc.nextInt();
        System.out.println("enter student name:");
        Name=sc.next();
        System.out.println("enter semester:");
        Semester=sc.nextInt();
        System.out.println("enter cpi:");
        cpi=sc.nextDouble();
    }
    void prntdtl(){
        System.out.println("enrollment nois "+Enrollment_No);
        System.out.println("name is "+Name);
        System.out.println("semester is "+Semester);
        System.out.println("cpi is "+cpi);
    }
}

public class Student {
    public static void main(String[] args) {
        
        Student_Detail[] sd=new Student_Detail[5];
        for(int i=0;i<5;i++){
            sd[i]=new Student_Detail();
            System.out.println("enter information of student "+(i+1));
        sd[i].readdtl();
           }
        for(int i=0;i<5;i++){
            System.out.println("information of student "+(i+1));
        
        sd[i].prntdtl();    
    }
}
}

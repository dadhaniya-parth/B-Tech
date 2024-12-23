// 34. Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary.
//  Write a program to read the detail from user and print it.

import java.util.*;

public class Employee_Detail {
    int Employee_ID;
    String Name;
    String Designation;
    double Salary;
   
    Employee_Detail(int Employee_ID,String Name,String Designation,double Salary){
        this.Employee_ID = Employee_ID;
        this.Name = Name;
        this.Designation = Designation;
        this.Salary = Salary;
    }

    void display(){
        System.out.println("Employee ID: "+Employee_ID);
        System.out.println("Name: "+Name);
        System.out.println("Designation: "+Designation);
        System.out.println("Salary: "+Salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int Employee_ID = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String Name = sc.next();
        System.out.println("Enter Employee Designation:");
        String Designation = sc.next();
        System.out.println("Enter Employee Salary:");
        double Salary = sc.nextDouble();
    
        Employee_Detail emp = new Employee_Detail(Employee_ID, Name, Designation, Salary);
        emp.display();
    }
}
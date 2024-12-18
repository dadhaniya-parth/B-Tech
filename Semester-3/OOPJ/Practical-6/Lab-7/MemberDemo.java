
import java.util.Scanner;

// 3. Create a class named 'Member' having the following members: 1-Name 2-Age 3-Phone number 4-Address 5-Salary It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now assign name, age, phone number address and salary to an employee and a manager by making an object of both of these classes and print the same along with specialization and department respectively. [B]

class Member {
    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;

    void setMemberDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Enter age: ");
        this.age = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        this.phoneNumber = sc.nextLong();
        System.out.println("Enter Address: ");
        this.address = sc.nextLine();
        System.out.println("Enter Salary:");
        this.salary = sc.nextDouble();
    }

    double printSalary() {
        return salary;
    }
}

class Employee extends Member {
    String specialization;
    void setEmpDetails(){
        System.out.println("Enter Employee Specialization:");
        Scanner sc = new Scanner(System.in);
        this.specialization = sc.nextLine();
    }

}

class Manager extends Member {
    String department;

}

public class MemberDemo {
    public static void main(String[] args) {

    }
}

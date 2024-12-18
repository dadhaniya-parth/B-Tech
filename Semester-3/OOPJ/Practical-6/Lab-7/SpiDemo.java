// 1. Declare a class called Student having following data members:id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi. Define constructor and calculate_spi methods. Define main to instantiate an array for objects of class student to process data of n students to be given as command line arguments. [A]

import java.lang.*;
import java.util.*;

public class SpiDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        size = Integer.parseInt(args[0]);
        student[] s = new student[size];

        System.out.println("Enter Student Name & Rollno:");
        for (int i = 0; i < size; i++) {
            String name = sc.nextLine();
            int Enrol = sc.nextInt();
            s[i] = new student(name, Enrol);
            s[i].getsubjectDetails();
            s[i].calculateSPI();
            s[i].displayResult();
        }
    }
}

class student {

    String name;
    int Enrol;
    String[] subjects = {"DBMS", "OOP", "WT-1", "DS"};
    int[] credits = {6, 5, 5, 6};
    int[] marks = {70, 80, 90, 89};
    int total_credits = 22;
    double sumPoints = 0;
    double spi;
    Scanner sc = new Scanner(System.in);

    student(String name, int Enrol) {
        this.name = name;
        this.Enrol = Enrol;
    }

    void getsubjectDetails() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Subject Name: " + subjects[i]);
            marks[i] = sc.nextInt();
            sumPoints += calculateGradePoints(marks[i], credits[i]);
        }
    }

    int calculateGradePoints(int marks, int credits) {
        int gp;
        if (marks >= 90) {
            gp = 10;
        } else if (marks >= 80) {
            gp = 9;
        } else if (marks >= 70) {
            gp = 8;
        } else if (marks >= 60) {
            gp = 7;
        } else if (marks >= 50) {
            gp = 6;
        } else if (marks >= 40) {
            gp = 4;
        } else {
            gp = 0;
        }
        return gp * credits;
    }

    void calculateSPI() {
        spi = sumPoints / total_credits;
    }

    void displayResult() {
        System.out.println("Student Name:"+name);
        System.out.println("Student Enrolment Number:"+Enrol);
        System.out.println("Student SPI:"+spi);
    }
}

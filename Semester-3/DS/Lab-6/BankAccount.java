// 37. Create a class BankAccount with attributes like account number, balance, account holder and name. Create an array
//  of BankAccount objects to store bank accounts. Implement methods to deposit money, withdraw money and check balance.

import java.util.*;
 class Bank {
    int accno;
    int balance;
    String accholdername;

    void deposite(int money){
        balance+=money;
        System.out.println("current balance:"+balance);
    }

    void withdraw(int money){
        balance-=money;
        System.out.println("current balance:"+balance);
    }

    void check(){
        System.out.println("current balance:"+balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Bank acc=new Bank();
       int num;
       System.out.print("give holder name:");
       acc.accholdername=sc.nextLine();
       System.out.print("give account number:");
       acc.accno=sc.nextInt();
       System.out.print("give balance:");
       acc.balance=sc.nextInt();
       while(true){
       System.out.println("for deposite press 1");
       System.out.println("for withdraw press 2");
       System.out.println("for check balance print 3");
       System.out.println("for exit press 4");
       num=sc.nextInt();
       if (num==1) {
        System.out.print("which money you have to deposite:");
        int deposite=sc.nextInt();
        acc.deposite(deposite);
       }
       else if(num==2){
        System.out.print("which money you have to withdraw:");
        int withdraw=sc.nextInt();
        acc.withdraw(withdraw);
       }
       else if(num==3){
        acc.check();
       }
       else if(num==4){
        break;
       }
       else{
        System.out.println("enter proper number");
       }
       }

    }
}

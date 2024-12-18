// 3. Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, Also create methods getAccountDetails() and displayAccountDetails(). [A]

import java.util.*;
class Bank_Account{
    int accountNo,accountBalance;
    String userName,email,accountType;
    Scanner sc = new Scanner(System.in);
    void getAccountDetails(){
        System.out.println("Enter Account Number:");
        accountNo=sc.nextInt();
        System.out.println("Enter UserName:");
        userName=sc.next();
        System.out.println("Enter Email:");
        email=sc.next();
        System.out.println("Enter Account Type:");
        accountType=sc.next();
        System.out.println("Enter Account Balance:");
        accountBalance=sc.nextInt();
    }

    void displayAccountDetails(){
        System.out.println("Account Number: "+accountNo);
        System.out.println("User Name: "+userName);
        System.out.println("Email: "+email);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: "+accountBalance);
    }
}
public class Bank {
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account();
        b.getAccountDetails();
        b.displayAccountDetails();       
    }
}

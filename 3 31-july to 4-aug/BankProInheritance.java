

import java.util.Scanner;

class Bank {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    double balance=50000;
    int choice;

    public void deposite() {
        System.out.print("Enter Deposit Amount:");
        double depositAmount = sc.nextDouble();
        balance += depositAmount;
    }

    public void withdrawl() {
        System.out.print("Enter withdrawal Amount:");
        double withdrawalAmount = sc.nextDouble();
        balance -= withdrawalAmount;
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void exitProgram() {
        flag = false;
    }
    public void invalidChoiceMsg(){
    System.out.println("Enter a invalid choice");
    }

    
}

class Atm extends Bank{
    public void UserInterFace() {
        while (flag) {
            System.out.println("1.Deposite 2.withdraw 3.checkbalance 0.exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    deposite();
                    break;
                case 2:
                    withdrawl();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 0:
                    exitProgram();
                    break;
                default:
                    invalidChoiceMsg();

            }
        }
    }
}

public class BankProInheritance {
    public static void main(String[] args) {
        Atm A = new Atm();
        System.out.println("--Start Program--");
        A.UserInterFace();
        System.out.println("--End Program--");

    }
}

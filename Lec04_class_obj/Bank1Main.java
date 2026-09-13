package Lec04_class_obj;

import java.util.Scanner;

public class Bank1Main {

    public static void main(String[] args) {
        int num=0;
        while ((num > 2 || num < 1)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("select 1 for deposite And 2 for withdraw :");

            num = sc.nextInt();
            if (num > 2 || num < 1) {
                System.out.println("enter valid option either choose 1 or 2");
            } else {
                System.out.print("Enter Amount :");
                double amt = sc.nextDouble();

                BankAccount1 ba = new BankAccount1();

                ba.setBalance(120000.0);
                if (num == 1) {
                    double sum = ba.deposite(amt);
                    System.out.println(+amt + " Amount Deposited And the current balance is " + sum);

                } else if (num == 2) {
                    double sum1 = ba.withdraw(amt);
                    System.out.println(+amt + " Amount Withdraw And the current balance is " + sum1);

                }
            }

        }
    }
}
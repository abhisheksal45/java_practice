package Lec04_class_obj;

import java.util.Scanner;

public class BankAccount {
     String Holder_name = "daniel";
    int acc_no = 123765;
    static Double balance = 1000.0;



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("1 deposite: ");
        System.out.print("2 withdraw:");
        int n=sc.nextInt();
        System.out.println("Enter Amount :");
        double num=sc.nextDouble();
        Bank ba=new Bank();
        ba.deposite(n,num);
    }

    public static class Bank{

      public int deposite(int n,double num) {
          if (n == 1) {

              double depo = balance + num;
              System.out.println("the amount is deposited and current amount is " +depo);
          }
else if(n==2){
    double with=balance-num;
              System.out.println("the amount is withdraw and current amount is " +with);

          }
      return (int) (n+num);
      }


    }
}
package lec03;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no :");
      int n=sc.nextInt();
      int num1=0,num2=1;
      System.out.print("Fibonacci series :" +num1+" "+num2);
      for(int i=1;i<n;i++){
        int  num3=num1+num2;
        System.out.print(" "+num3);

        num1=num2;
        num2=num3;
      }

        }
    }


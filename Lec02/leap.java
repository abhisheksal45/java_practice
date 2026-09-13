package Lec02;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    System.out.println("Enter year you want to check if its leap year or not");
    int year=sc.nextInt();
    if(year%4==0 && year%100!=0 || year%400==0){
        System.out.println("Leap year");
    }
   else{
       System.out.println("not leap year");
    }
    }
}

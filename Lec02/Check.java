package Lec02;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a no :");
        int num=in.nextInt();

        if(num>0){
            System.out.println("the given no is positive and no is " +num);

        } else if (num<0) {
            System.out.println("Number is negative and given no is "+num);

        }
          else if(num==0){
              System.out.println("0 Number is neither positive nor negative ");
        }
   else{
       System.out.println("Invalid no");
        }
    }
}

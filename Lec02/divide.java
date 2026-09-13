package Lec02;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no");
        int no=sc.nextInt();

        if(no%5==0){
            System.out.println("The given no is divide by 5");
        }
       else if(no%11==0) {
           System.out.println("the given no is divide by 11");
        }
    else{
        System.out.println("The given no neither divide by 5 nor divide by 11");
        }
    }
}

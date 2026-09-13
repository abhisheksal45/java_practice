package Lec02;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        if (age >18 && age<70){
            System.out.println("You are eligible for vote");
        }
   else {
       System.out.println("You are not eligible for vote");
        }
    }
}

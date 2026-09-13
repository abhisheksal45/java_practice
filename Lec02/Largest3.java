package Lec02;

import java.util.Scanner;

public class Largest3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest no is " +a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest no is " +b);
        }
    else{
            System.out.println("The greatest no is " +c);
        }
    }
}

package Lec02;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("Given Character is in Uppercase");
        }
   else{
       System.out.println("given Character is in lower case");
        }
    }
}

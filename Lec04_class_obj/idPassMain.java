package Lec04_class_obj;

import java.util.Scanner;

public class idPassMain {
    public static void main(String[] args) {

        IdPass id=new IdPass("Abhi45","Abhi@123");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username :");
        String username=sc.next();
        System.out.print("Enter Password :");
        String password=sc.next();
        id.Validateid_pass(username,password);
    }
}

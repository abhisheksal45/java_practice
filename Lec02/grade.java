package Lec02;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks you got ,i will show you which grade you got");
        System.out.println("please enter marks under 500");
        int marks ;
        while(true){
             marks = sc.nextInt();
            if (marks > 500 || marks < 0) {
            System.out.println("Enter valid marks");
            System.out.println("Please enter marks again:");
        }

           else if (marks >= 450 && marks <= 500) {
                System.out.println("You got Grade A+");
                break;
            } else if (marks >= 400 && marks <= 449) {
                System.out.println("You got Grade A");
                break;
            } else if (marks >= 350 && marks <= 399) {
                System.out.println("You got Grade B+");
                break;
            } else if (marks >= 300 && marks <= 349) {
                System.out.println("You got Grade B");
                break;
            } else if (marks >= 250 && marks <= 299) {
                System.out.println("You got Grade C");
                break;
            } else if (marks >= 200 && marks <= 249) {
                System.out.println("You got Grade D");
                break;
            } else if (marks < 200) {
                System.out.println("You got Grade F");
                break;
            }
        }
    }
}

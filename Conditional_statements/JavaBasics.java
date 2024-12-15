package Conditional_statements;

import java.util.Scanner;

class JavaBasics {
    // public static String evenOrOdd(int n) {
    // if (n % 2 == 0) {
    // return n + " is even number.";
    // } else {
    // return n + " is odd number.";
    // }

    // }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check even or odd: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even number.");
        } else {
            System.out.println(n + " is odd number.");
        }

        if (n >= 18) {
            System.out.println("Adult");
        } else if (n >= 13 && n < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Adult");
        }
    }

}
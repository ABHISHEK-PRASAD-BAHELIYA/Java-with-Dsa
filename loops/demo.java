package loops;

// while loops practice
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int counter = 01;
        int sum = 0;

        while (counter <= n) {
            sum += counter;
            System.out.println(counter + ". Hello world");
            counter++;
        }
        System.out.println("Printed Hello world " + n + "x");
        System.out.println("sum of " + n + " natural number is: " + sum);

        // print reverse of a number
        while (n > 0)

        {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }

    // use For loops

}
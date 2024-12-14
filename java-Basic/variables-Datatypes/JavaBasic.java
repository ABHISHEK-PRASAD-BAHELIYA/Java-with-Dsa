
// Boilerplate code
import java.util.*;

public class JavaBasic {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Abhishek");

        // print patterns
        System.out.println("****\n***\n**\n*");

        // variables
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony stark";
        System.out.println(name);

        a = 50;
        a = b;
        System.out.println(a);

        // Datatypes
        int x = 10;
        int y = 5;
        int sum = x + y;
        System.out.println("sum of  and y = " + sum);

        // input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        int number = sc.nextInt();
        System.out.println(number);
    }
}
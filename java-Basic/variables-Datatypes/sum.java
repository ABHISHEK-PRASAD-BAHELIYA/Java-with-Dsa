import java.util.*;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        // area of circle
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Area of circle: " + area);

    }
}
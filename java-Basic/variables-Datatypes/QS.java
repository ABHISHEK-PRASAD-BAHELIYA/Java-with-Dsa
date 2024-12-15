import java.util.*;

public class QS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("what will be type of result in following Java code");
        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        // result = (f * b) + (i % c) + (d*s);
        System.out.println("========== Average number ===========");
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println("Average number: " + avg);

        System.out.println("============== side of square ===============");
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("Area of square: " + area);

        System.out.println("========= pencil, pen and eraser with 18% gst =========");
        System.out.print("Enter price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter price of eraser: ");
        float eraser = sc.nextFloat();

        double totalPrice = pen + pencil + eraser;
        double gstRate = 18.0;
        double gstAmount = (totalPrice * gstRate) / 100;
        double totalPriceWithGST = totalPrice + gstAmount;

        System.out.println("Total price (before GST): " + totalPrice);
        System.out.println("GST Amount (18%): " + gstAmount);
        System.out.println("Total price (After GST): " + totalPriceWithGST);

    }
}
package patterns;

public class Star {

    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========= Inverted Star ===========");
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======== Half Pyramid pattern ========");
        for (int line = 1; line <= 4; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }

        System.out.println("========= CHARACTER PATTERN ==========");
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
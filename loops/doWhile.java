package loops;

public class doWhile {

    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.println(counter + ". Hello world");
            counter++;
        } while (counter <= 10);
    }
}
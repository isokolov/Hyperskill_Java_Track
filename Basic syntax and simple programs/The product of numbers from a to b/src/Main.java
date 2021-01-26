import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long multiply = 1;

        for (long i = a; i < b; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
    }
}

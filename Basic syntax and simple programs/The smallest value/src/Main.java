import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner reader = new Scanner(System.in);

        long m = reader.nextLong();
        long nFactorial = 1;

        for (int i = 1; i <= m; i++) {
            nFactorial *= i;
            if (nFactorial > m) {
                System.out.println(i);
                break;
            }
        }
    }
}

import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger number1 = scanner.nextBigInteger();
        BigInteger number2 = scanner.nextBigInteger();
        BigInteger number3 = scanner.nextBigInteger();
        BigInteger number4 = scanner.nextBigInteger();

        System.out.println(number1.multiply(new BigInteger("-1")).multiply(number2).add(number3).subtract(number4));

    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number
        String major = ".*[A-Z]+.*";
        String minus = ".*[a-z]+.*";
        String numbers = ".*[0-9]+.*";

        System.out.println(regNum.matches(major) && (regNum.matches(minus)
                && regNum.matches(numbers) && regNum.length() >= 12) ? "YES" : "NO");


    }
}

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();

        System.out.println(date.getYear() < date.plusDays(days).getYear());
    }
}

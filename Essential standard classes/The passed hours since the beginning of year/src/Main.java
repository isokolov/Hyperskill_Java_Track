import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.parse(scanner.nextLine());

        int hours = (dateTime.getDayOfYear() - 1)  * 24 + dateTime.getHour();

        System.out.print(hours);

    }
}

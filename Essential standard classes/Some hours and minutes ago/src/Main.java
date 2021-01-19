import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime time = LocalTime.parse(scanner.nextLine());

        System.out.println(time
                .minusHours(scanner.nextInt())
                .minusMinutes(scanner.nextInt())
        );
    }
}

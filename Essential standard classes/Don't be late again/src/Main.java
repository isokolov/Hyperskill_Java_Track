import java.util.*;
import java.time.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime localtime = LocalTime.parse("20:00:00");
        int numberLines = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numberLines; i++) {
            list.add(scanner.nextLine());
        }
        List<String> locations = new ArrayList<>();
        for (String str: list) {
            String[] placeTime = str.split(" ");
            if (localtime.isBefore(LocalTime.parse(placeTime[1]))) {
                locations.add(placeTime[0]);
            }
        }
        for (String str: locations) {
            System.out.println(str);
        }
    }
}

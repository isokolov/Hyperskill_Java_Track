import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");

        LocalTime timeA = LocalTime.parse(input1[0]);
        LocalTime timeB = LocalTime.parse(input1[1]);

        LocalTime timeX = LocalTime.parse(input2[0]);
        LocalTime timeY = LocalTime.parse(input2[1]);

        if(timeX.isAfter(timeA) && timeX.isBefore(timeB))
            result = true;

        if(timeY.isBefore(timeB) && timeX.isAfter(timeA))
            result = true;

        if(timeA.isAfter(timeX) && timeA.isBefore(timeY))
            result = true;

        if(timeB.isBefore(timeY) && timeA.isAfter(timeX))
            result = true;

        if(timeA.equals(timeY) || timeB.equals(timeX))
            result = true;

        System.out.print(result);

    }
}

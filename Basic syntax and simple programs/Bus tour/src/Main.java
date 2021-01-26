import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int heightOfBus = reader.nextInt();
        int numberOfBridges = reader.nextInt();
        int heightOfBridge;
        boolean crash = true;

        for (int i = 1; i <= numberOfBridges; i++) {
            heightOfBridge = reader.nextInt();
            if (heightOfBus < heightOfBridge) {
                crash = false;
            } else {
                System.out.println("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }

        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}

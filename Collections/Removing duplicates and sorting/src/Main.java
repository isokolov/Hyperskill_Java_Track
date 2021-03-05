import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        // put your code here
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int setSize = scanner.nextInt();
        for (int i = 0; i < setSize; i++) {
            set.add(scanner.next());
        }

        set.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
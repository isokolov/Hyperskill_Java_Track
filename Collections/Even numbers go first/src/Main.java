import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int element = scanner.nextInt();
            if (element % 2 == 0) {
                deque.addFirst(element);
            } else {
                deque.addLast(element);
            }
        }

        deque.forEach(System.out::println);
    }
}

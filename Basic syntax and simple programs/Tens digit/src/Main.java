import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        char[] chars = scanner.nextLine().toCharArray();
        if (chars.length == 1) {
            System.out.println(0);
        } else {
            System.out.println(chars[chars.length - 2]);
        }
    }
}

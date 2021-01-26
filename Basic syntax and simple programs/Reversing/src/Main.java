import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String line = scanner.nextLine();
        System.out.println(Integer.parseInt(new StringBuilder(line).reverse().toString()));
    }
}

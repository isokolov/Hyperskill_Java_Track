import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();


        boolean cups1 = ((cups >= 10 && cups <= 20) && !weekend) || ((cups >= 15 && cups <= 25) && weekend);

        System.out.print(cups1);
    }
}

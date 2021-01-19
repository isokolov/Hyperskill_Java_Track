import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double n = b * b - 4 * a * c;
        float m1 = (float) ((-b + Math.sqrt(n)) / (2 * a));
        float m2 = (float) ((-b - Math.sqrt(n)) / (2 * a));
        System.out.println(Math.min(m1, m2) + " " + Math.max(m1, m2));
    }
}

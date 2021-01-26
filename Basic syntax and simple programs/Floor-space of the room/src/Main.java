import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = 0.5 * (a+b+c);
                double areaOfTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                //String resultOfTriangle = String.format("%.1f", areaOfTriangle);
                System.out.println(areaOfTriangle);
                break;
            case "rectangle":
                double m = scanner.nextDouble();
                double n = scanner.nextDouble();
                double areaOfRectangle = (m * n);
                //String resultOfRectangle = String.format("%.1f", areaOfRectangle);
                System.out.println(areaOfRectangle);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double areaOfCircle = 3.14 * r * r;
                //String resultOfCircle = String.format("%.1f", areaOfCircle);
                System.out.println(areaOfCircle);
                break;
        }

    }
}
import java.util.Scanner;

class RemoveExtraSpacesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        // write your code here
        String result = text.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}

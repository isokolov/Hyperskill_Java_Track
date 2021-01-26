import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regNum = scanner.nextLine(); // a valid or invalid registration number
        String regPart1 = "[ABEKMHOPCTYX]";
        String regExp = regPart1 + "{1}\\d{3}" + regPart1 + "{2}";

        /* write your code here */
        System.out.println(regNum.matches(regExp));
        
    }
}

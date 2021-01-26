import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("\\/\\*.*?\\*\\/");
        Matcher matcher = pattern.matcher(codeWithComments);
        String codeWithoutComments = matcher.replaceAll("");
        String codeWithoutComments2 = codeWithoutComments.replaceAll("//.*", "");
        System.out.println(codeWithoutComments2);
        
    }
}

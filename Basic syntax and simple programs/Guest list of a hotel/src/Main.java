import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        Collections.reverse(list);
        for (String str: list) {
            System.out.println(str);
        }
    }
}
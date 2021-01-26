import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        int i = 0;
        while (i < n) {
            int sequenceNumber = sc.nextInt();
            if (sequenceNumber % 4 == 0 && sequenceNumber > max) {
                max = sequenceNumber;
            }
            i++;
        }
        System.out.println(max);
    }
}

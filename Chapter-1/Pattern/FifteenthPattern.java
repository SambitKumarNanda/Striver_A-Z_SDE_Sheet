import java.util.Scanner;

public class FifteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fifteen_pattern(num);
    }

    private static void fifteen_pattern(int num) {
        int c = 0;
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print((char) ('A' + c) + " ");
                c++;
            }
            c = 0;
            System.out.println();
        }
    }
}

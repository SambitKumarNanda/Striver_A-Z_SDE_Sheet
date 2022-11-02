import java.util.Enumeration;
import java.util.Scanner;

public class FourteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        pattern_forteen(num);
    }

    private static void pattern_forteen(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println("");
        }
    }
}

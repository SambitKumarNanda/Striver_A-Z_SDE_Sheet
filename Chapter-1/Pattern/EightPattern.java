import java.util.*;

public class EightPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern_8(n);
        }

    private static void pattern_8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col1 = 0; col1 <= row ; col1++) {
                System.out.print(" ");
            }
            for (int col2 = n; col2 > row ; col2--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

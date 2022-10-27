import java.util.*;

public class TenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        pattern_ten(n);
    }

    private static void pattern_ten(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int total_cols = row > n ? 2 * n - row : row;
            for (int col = 0; col < total_cols; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

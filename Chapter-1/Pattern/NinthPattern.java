import java.util.*;
class NinthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ninth_pattern(n);
        scanner.close();
    }

    private static void ninth_pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int total_cols = row > n ? 2 * n -row: row;

            int total_spaces = n - total_cols;
            for (int s = 0; s < total_spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < total_cols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
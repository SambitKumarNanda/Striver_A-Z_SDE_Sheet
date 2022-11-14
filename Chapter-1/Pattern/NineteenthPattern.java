import java.util.Scanner;

public class NineteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        nineteen_pattern(num);
    }

    private static void nineteen_pattern(int num) {
        for (int row = 0; row < 2 * num; row++) {
            int total_cols = row > num ? 2 * num -row: row;

            int total_spaces = num - total_cols;
            for (int s = 0; s <= total_spaces; s++) {
                System.out.print("* ");
            }

            for (int col = 0; col < total_cols; col++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

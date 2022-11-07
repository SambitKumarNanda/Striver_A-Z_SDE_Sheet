import java.util.Scanner;

// eIGHTEEN pATTERN
public class EighteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        eighteen_pattern(n);
    }

    private static void eighteen_pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('E' - j) + " ");
            }
            System.out.println();
        }
    }
}

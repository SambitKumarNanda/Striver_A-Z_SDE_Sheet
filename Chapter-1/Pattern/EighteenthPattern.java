import java.util.Scanner;

public class EighteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        eighteen_pattern(n);
    }

    private static void eighteen_pattern(int n) {
        for (int i = n-1; i >= 0; i--) {
            for (int j = n-1; j >= i; j--) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}

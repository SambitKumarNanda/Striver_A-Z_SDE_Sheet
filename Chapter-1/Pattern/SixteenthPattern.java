import java.util.Scanner;

public class SixteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =  scanner.nextInt();
        scanner.close();

        sixteen_pattern(num);
    }

    private static void sixteen_pattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }
}

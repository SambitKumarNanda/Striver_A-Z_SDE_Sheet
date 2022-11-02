import java.util.Scanner;

public class ThirteenthPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        pattern_thirteen(number);
    }

    private static void pattern_thirteen(int number) {
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }
}

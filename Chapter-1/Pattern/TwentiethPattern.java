import java.util.Scanner;

public class TwentiethPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        twenty_pattern(num);
    }

    private static void twenty_pattern(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < ; j++) {

            }
        }
            System.out.println();
    }
}

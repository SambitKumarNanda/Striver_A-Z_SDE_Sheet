import java.util.*;

public class EleventhPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        eleven_pattern(n);
    }

    private static void eleven_pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                int num = col % 2 == 0 ? 0 : 1;
                System.out.print(num);
            }
            System.out.println("");
        }
    }
}

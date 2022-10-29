import java.util.*;
public class TwelthPattern {

//    Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        twelve_pattern(n);
    }

    private static void twelve_pattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int gap = 0; gap < row; gap++) {
                System.out.print("");
            }
            for (int col = 0; col < row; col++) {
                System.out.println(col);
            }
        }
    }
}

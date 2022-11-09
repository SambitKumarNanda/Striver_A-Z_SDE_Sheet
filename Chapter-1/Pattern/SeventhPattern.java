
import java.util.*;
public class SeventhPattern {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      pattern_7(n);
      }

    private static void pattern_7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = n; spaces > row; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1; col++) {
                if (col <= row) {
                    System.out.print((char)('A' + col - 1));
                }
                else {
                    System.out.print((char)('A' + (2*row - col - 1)));
                }

            }
            System.out.println();
        }
    }
}

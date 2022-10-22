import java.util.*;
public class SeventhPattern {
  public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      pattern_7(n);
      }

    private static void pattern_7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(" ");
            }
            for (int col1 = 0; col1 <= row; col1++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

import java.util.*;
public class TwelthPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        twelve_pattern(n);
    }

    private static void twelve_pattern(int n) {
        for (int i=1; i<=n; i++) {

            for (int j=1; j<=n; j++) {
                if (j<=i){
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j=n; j>=1; j--) {
                if (j<=i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

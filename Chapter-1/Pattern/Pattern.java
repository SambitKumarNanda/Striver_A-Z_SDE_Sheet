import java.io.*;
import java.util.Scanner;

public class Pattern {
        static boolean chkPair(int[] arr, int size, int x)
        {
            for (int i = 0; i < (size - 1); i++) {
                for (int j = (i + 1); j < size; j++) {
                    if (arr[i] + arr[j] == x) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int value = scanner.nextInt();

            if (chkPair(arr, size, value)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
}

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int [][]arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0){
                    zero_maker(arr,i,j);
                    break;
                }
            }
        }
    }

    private static void zero_maker(int[][] arr, int i, int j) {
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                arr[i][]
            }
        }
    }
}

import java.util.Scanner;

public class matrix_ques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix: \n");
        display_matrix(mat,rows,cols);
        zero_transformer(mat,rows,cols);
        System.out.println("Tranformed Matrix: \n");
        display_matrix(mat,rows,cols);
    }

    private static void display_matrix(int[][] mat, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void zero_transformer(int[][] mat, int rows, int cols) {

        int[][] temp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[i][j] = 1;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(mat[i][j] == 0){
                    for (int k = 0; k < rows; k++) {
                        temp[k][j] = 0;
                    }
                    for (int k = 0; k < cols; k++) {
                        temp[i][k] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = temp[i][j];
            }
        }

    }


}

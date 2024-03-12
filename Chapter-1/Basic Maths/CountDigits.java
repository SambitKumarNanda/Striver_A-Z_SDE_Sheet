import java.util.*;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.print(countDigits(inputNum));
        sc.close();
    }

    public static int countDigits(int inputNum) {
        int count = 0;
        while (inputNum > 0) {
            count++;
            inputNum /= 10;
        }
        return count;
    }
}
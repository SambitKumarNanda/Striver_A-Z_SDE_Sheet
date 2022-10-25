import java.util.*;
class NinthPattern{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);   
     int n = scanner.nextInt();
     ninth_pattern(n);
     scanner.close();
    }
    private static void ninth_pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
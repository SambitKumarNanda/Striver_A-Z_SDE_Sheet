import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numbers = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    System.out.println(gcdCalculate(numbers));
    sc.close();
  }

  private static int gcdCalculate(int[] numbers) {
    int gcd = 1;
    int max;
    if(numbers[0] > numbers[1]){
      max = numbers[0];
    }
    else{
      max = numbers[1];
    }
    for (int i = 1; i < max; i++) {
      if(numbers[0] % i == 0 && numbers[1] % i == 0){
        gcd = i;
      }
    }
    return gcd;
  }
}

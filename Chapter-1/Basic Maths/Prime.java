import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    System.out.println(isPrime(inputNumber));
    scanner.close();
  }

  public static boolean isPrime(int inputNumber){
    if(inputNumber == 1 || inputNumber == 0){
      return false;
    }
    if(inputNumber == 2 || inputNumber == 3 || inputNumber == 5 || inputNumber == 7){
      return true;
    }
    for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
      if(inputNumber % i == 0){
        return false;
      }
    }
    return true;
  }
}

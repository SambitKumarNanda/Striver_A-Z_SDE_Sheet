import java.util.Scanner;

class Factorial{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    System.out.println(fact(inputNumber));
    scanner.close();
  }

  public static int fact(int inputNumber){
    if(inputNumber == 0){
      return 1;
    }

    return inputNumber * fact(inputNumber - 1);
  }
}
import java.util.*;
public class PrintnNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    printNumbers(inputNumber);
    scanner.close();
  }

  public static int printNumbers(int inputNumber){

    // 1. Base Condition
    if(inputNumber == 0){
      return 0;
    }
    if(inputNumber > 0){
      System.out.println(inputNumber);
    }
    // 2. Recursive condition
    return printNumbers(inputNumber-1);
  }
}

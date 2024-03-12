import java.util.Scanner;

public class SumOfFirstNNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNum = scanner.nextInt();
    System.out.println(recurveSum(inputNum));
    scanner.close();
  }

  public static int recurveSum(int inputNum){
    if(inputNum <= 0){
      return inputNum;
    }
    return inputNum + recurveSum(inputNum - 1);
  }
}

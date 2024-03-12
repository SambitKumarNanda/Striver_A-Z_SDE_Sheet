import java.util.*;

public class Print1toN {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNum = scanner.nextInt();
    printNum(1, inputNum);
    scanner.close();
  }

  public static int printNum(int defaultValue, int inputNum){
    // Base Condition
    if(defaultValue > inputNum){
      return 0;
    }
    if(defaultValue <= inputNum){
      System.out.println(defaultValue);
    }
    return printNum(defaultValue + 1, inputNum);
  }
}

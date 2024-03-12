import java.util.*;
public class PrintNameNtimes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    int noOfTimes = scanner.nextInt();
    printRecName(inputString, noOfTimes);
    scanner.close();
  }

  public static String printRecName(String inputString, int noOfTimes){

    // 1. Base Condition
    if(noOfTimes == 0){
      return "";
    }
    if(noOfTimes > 0){
      System.out.println(inputString);
    }
    // 2. Recursive condition
    return printRecName(inputString, noOfTimes-1);
  }
}

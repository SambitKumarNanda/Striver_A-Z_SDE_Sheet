import java.util.*;
public class PrintNto1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    printNum(inputNumber);
    scanner.close();
  }

  public static int printNum(int inputNumber){
    if(inputNumber <= 1){
      System.out.println(inputNumber);
    }
    return printNum(inputNumber - 1);
  }
}

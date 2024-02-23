import java.util.ArrayList;
import java.util.Scanner;

class PrintDivisors{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    System.out.println(displayDivisors(inputNumber));
    scanner.close();
  }

  public static ArrayList<Integer> displayDivisors(int inputNumber){
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 1; i < inputNumber; i++) {
      if(inputNumber % i == 0){
        list.add(i);
      }
    }
  return list;
  }

}
import java.util.*;
public class Armstrong {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    System.out.println(isArmstrong(inputNumber));
    scanner.close();
  }

  public static boolean isArmstrong(int input){
    int digitCount = 0;
    int sum = 0;
    int temp = input;
    int temp1 = input;

    while(input > 0){
      digitCount++;
      input/=10;
    }
    while(temp > 0){
      sum += (int)Math.pow(temp%10, digitCount);
      digitCount ++;
      temp/=10;
    }

    return temp1 == sum;
  }
}

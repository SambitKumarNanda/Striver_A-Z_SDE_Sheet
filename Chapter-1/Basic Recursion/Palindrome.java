import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    System.out.println(checkPalindrome(inputString, 0, inputString.length() - 1));
    scanner.close();
  }
  public static boolean checkPalindrome(String inputString, int i, int j){
    // Base condition
    if(i >= j){
      return true;
    }

    if(inputString.charAt(i) != inputString.charAt(j)){
      return false;
    }

    return checkPalindrome(inputString, i + 1, j - 1);
  }
}

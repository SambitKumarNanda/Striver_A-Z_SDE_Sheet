import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int inputNumber = sc.nextInt();
   System.out.println(isPalindrome(inputNumber)); 
   sc.close();
  }

  private static boolean isPalindrome(int inputNumber) {
    int rev = 0;
    int temp = inputNumber;
    while(inputNumber > 0){
        int d = inputNumber % 10;
        rev = rev * 10 + d;
        inputNumber/=10;
    }
    System.out.println(rev);
   if(rev == temp){
    return true;
   }
   return false;
  }  
}

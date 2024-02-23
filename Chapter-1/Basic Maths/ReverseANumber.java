import java.util.*;
public class ReverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.print(reverse(inputNumber));
        sc.close();
    }
    
    public static int reverse(int inputNumber){
        int rev = 0;
        while(inputNumber > 0){
            int d = inputNumber % 10;
            rev = rev * 10 + d;
            inputNumber/=10;
        }
        return rev;
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int arraySize = scanner.nextInt();
  int[] newArray = new int[arraySize];
  for (int i = 0; i < arraySize; i++) {
    newArray[i] = scanner.nextInt();
  }
  System.out.println(Arrays.toString(reverse(newArray, 0, arraySize - 1)));
  scanner.close();
}  

public static int[] reverse(int[] inputArray, int left, int right){
// Base Condition
if(left > right){
  return inputArray;
}
// Reverse Operation
int temp = inputArray[left];
inputArray[left] = inputArray[right];
inputArray[right] = temp;

// Recursion function
return reverse(inputArray, left + 1, right - 1);
}
}


// Reverse an array
// [1, 2, 3, 4, 5]
// Output:- [5, 4, 3, 2, 1]

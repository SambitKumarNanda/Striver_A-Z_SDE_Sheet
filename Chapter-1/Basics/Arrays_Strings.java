import java.util.*;

public class Arrays_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array Declaration
        int []array = new int[3];       // Integer Array of size 3

        // Inserting elements into an array by taking user inputs
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Printing elements of an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // String declaration
        String predefinedString = "Aeroplane";
        System.out.println(predefinedString);

        // String declaration by taking user input
        String userdefinedString = scanner.nextLine();

        // Some String methods
        // 1. Length of String
        System.out.println(userdefinedString.length());

        // 2. Extracting a character from a particular index from a string
        System.out.println(userdefinedString.charAt(0));

        // 3. Extracting characters from string from a given starting index to an end index
        System.out.println(userdefinedString.substring(0, 3));

        // 4. Converts given string to lowercase
        System.out.println(userdefinedString.toLowerCase());

        // 5. Converts given string to uppercase
        System.out.println(userdefinedString.toUpperCase());

        // 6. To check if the String contains a particular character sequence
        System.out.println(predefinedString.contains("plane"));
    }
}

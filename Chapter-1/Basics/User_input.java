import java.util.*;

class User_input{
    public static void main(String[] args) {
         
        //  User input Scanner class and object
        Scanner scanner = new Scanner(System.in);

        // Integer input
        int integerInput = scanner.nextInt();

        // Float input
        float floatInput = scanner.nextFloat();

        // Double input
        double doubleInput = scanner.nextDouble();

        // String input
        String stringInput = scanner.nextLine();

        
        scanner.close();

        System.out.println("Integer input: " + integerInput + "\n" + "Float input: " + floatInput + "\n" + "Double input: " + doubleInput + "\n" + "String input: " + stringInput);

    }
}

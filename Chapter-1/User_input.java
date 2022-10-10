import java.util.*;

class User_input{
    public static void main(String[] args) {
         
        //  User input Scanner class and object
        Scanner scanner = new Scanner(System.in);

        // Integer input
        int a = scanner.nextInt();

        // Float input
        float f = scanner.nextFloat();

        // Double input
        double d = scanner.nextDouble();

        // String input
        String str = scanner.nextLine();

        
        scanner.close();

        System.out.println("Integer input: " + a + "\n" + "Float input: " + f + "\n" + "Double input: " + d + "\n" + "String input: " + str);

    }
}
import java.util.*;

public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days = scanner.nextLine();

        scanner.close();

        switch(days){

            case "Monday":
            System.out.println("Its Monday");
            break;

            case "Tuesday":
            System.out.println("It's Tuesday");
            break;

            case "Wednesday":
            System.out.println("It's Wednesday");
            break;

            case "Thursday":
            System.out.println("It's Thursday");
            break;

            case "Friday":
            System.out.println("It's Friday");
            break;

            case "Saturday":
            System.out.println("It's Saturday");
            break;

            case "Sunday":
            System.out.println("It's Sunday");
            break;

            default:
            System.out.println("Wrong choice");
        }
    }
}

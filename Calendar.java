import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {
    public static void main(String args[]) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
                            "Jan.", "Feb.", "Mar.", "Apr.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
                            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month:");
        String month = keyboard.nextLine();

        while (Arrays.asList(months).contains(month) != true) {
            System.out.println("Invalid input!\nEnter month:");
            month = keyboard.nextLine();
        }

        System.out.println("Enter year:");
        int year;
        while (true) {
            try {
                year = keyboard.nextInt();
                break;
            }
            catch (InputMismatchException ne) {
                System.out.println("Invalid input!\nEnter year:");
                keyboard.next();
            }
        }
        
        keyboard.close();

        String[] months31 = {"January", "March", "May", "July", "August", "October", "December",
                            "Jan.", "Mar.", "Aug.", "Oct.", "Dec.",
                            "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec", "1", "3", "5", "7", "8", "10", "12"};
        String[] months30 = {"April", "June", "September", "November", "Apr.", "Sept.", "Nov.", "Apr", "Jun", "Sep", "Nov", "4", "6", "9", "11"};

        if (Arrays.asList(months31).contains(month)) {
            System.out.println("31 days");
        }
        else if (Arrays.asList(months30).contains(month)) {
            System.out.println("30 days");
        }
        else {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("29 days");
            }
            else {
                System.out.println("28 days");
            }
        }
    }
}
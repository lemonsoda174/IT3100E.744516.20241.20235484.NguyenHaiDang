import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayHandling {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n;
        while (true) {
            try {
                n = keyboard.nextInt();
                break;
            }
            catch (InputMismatchException ne) {
                System.out.println("Invalid input!\nEnter array size:");
                keyboard.next();
            }
        }

        int[] a = new int[n];
        int sum = 0;
        double avg = 0;
        System.out.println("Input array elements:");
        for (int i = 0; i < n; i++) {
            if (keyboard.hasNextInt()) {
                a[i] = keyboard.nextInt();
                sum = sum + a[i];
                avg = avg + a[i];
            }
        }
        avg = avg / n;
        Arrays.sort(a);
        
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            // prints the elements of an array
            System.out.print(a[i] + " ");
        }
        System.out.print("\nThe sum of all array elements is " + sum + "\nThe average of all array elements is " + avg);
        keyboard.close();
    }
}

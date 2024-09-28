import java.util.Scanner;

public class StarTriangle {
    public static void main(String args[]) {
        int n;
        String spaces, asterisks;
        Scanner n_input = new Scanner(System.in);
        System.out.println("Input n:");
        n = n_input.nextInt();
        for (int i = 1; i <= n; i++) {
            spaces = new String(new char[n-i]).replace("\0", " ");
            asterisks = new String(new char[2*i-1]).replace("\0", "*");
            System.out.println(spaces + asterisks + spaces);
          }
    }
}

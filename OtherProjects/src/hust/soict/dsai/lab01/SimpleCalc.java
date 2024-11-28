import javax.swing.JOptionPane;

public class SimpleCalc {
    
    public static void main(String[] args) {
        String strNum1, strNum2, res;
        double num1, num2, sum, diff, prod, quot;

        strNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        diff = Math.abs(num1-num2);
        prod = num1 * num2;

        if (num2 != 0) {
            quot = num1 / num2;
            res = String.format("The sum is %.2f\nThe difference is %.2f\nThe product is %.2f\nThe quotient is %.2f", sum, diff, prod, quot);
            JOptionPane.showMessageDialog(null, res,
            "Result", JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }
        else {
            res = String.format("The sum is %.2f\nThe difference is %.2f\nThe product is %.2f\nThe quotient is non-existent because divisor is 0", sum, diff, prod);
            JOptionPane.showMessageDialog(null, res,
            "Result", JOptionPane.INFORMATION_MESSAGE);

            System.exit(0);
        }

    }

}

import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String strx;
        double x;
        strx = JOptionPane.showInputDialog(null, 
                "Please type 1 for Linear equation solver\nPlease type 2 for Linear system solver\nPlease type 3 for Quadratic equation solver", "Equation solver",
                JOptionPane.INFORMATION_MESSAGE);

        x = Double.parseDouble(strx);

        if (x == 1) {
            String strNum1, strNum2;
            double a, b;

            strNum1 = JOptionPane.showInputDialog(null, 
                    "The equation should be in the form of ax + b = 0\nPlease input a: ", "First degree equation solver",
                    JOptionPane.INFORMATION_MESSAGE);

            strNum2 = JOptionPane.showInputDialog(null, 
                    "The equation should be in the form of ax + b = 0\nPlease input b: ", "First degree equation solver",
                    JOptionPane.INFORMATION_MESSAGE);

            a = Double.parseDouble(strNum1);
            b = Double.parseDouble(strNum2);

            first_degree_equation_solver(a, b);
        }

        else if (x==2) {
            String stra11, stra12, strb1, stra21, stra22, strb2;
            double a11, a12, b1, a21, a22, b2, D, D1, D2;

            stra11 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input a11: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            stra12 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input a12: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            strb1 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input b1: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            stra21 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input a21: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            stra22 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input a22: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            strb2 = JOptionPane.showInputDialog(null, 
                    "The system should be in the form of: a11*x1 + a12*x2 = b1 and a21*x1 + a22*x2 = b2\nPlease input b2: ", "Linear system solver",
                    JOptionPane.INFORMATION_MESSAGE);

            a11 = Double.parseDouble(stra11);
            a12 = Double.parseDouble(stra12);
            b1 = Double.parseDouble(strb1);
            a21 = Double.parseDouble(stra21);
            a22 = Double.parseDouble(stra22);
            b2 = Double.parseDouble(strb2);

            D = a11*a22 - a21*a12;
            D1 = b1*a22 - b2*a12;
            D2 = a11*b2-a21*b1;

            linear_system_solver(D, D1, D2);
        }

        else if (x == 3) {
            String strNum1, strNum2, strNum3;
            double a, b, c, delta;

            strNum1 = JOptionPane.showInputDialog(null, 
                    "The equation should be in the form of ax^2 + bx + c = 0\nPlease input a: ", "Quadratic equation solver",
                    JOptionPane.INFORMATION_MESSAGE);

            strNum2 = JOptionPane.showInputDialog(null, 
                    "The equation should be in the form of ax^2 + bx + c = 0\nPlease input b: ", "Quadratic equation solver",
                    JOptionPane.INFORMATION_MESSAGE);

            strNum3 = JOptionPane.showInputDialog(null, 
                    "The equation should be in the form of ax^2 + bx + c = 0\nPlease input c: ", "Quadratic equation solver",
                    JOptionPane.INFORMATION_MESSAGE);

            a = Double.parseDouble(strNum1);
            b = Double.parseDouble(strNum2);
            c = Double.parseDouble(strNum3);

            delta = b*b-4*a*c;

            quadratic_equation_solver(a,b,c,delta);
        }
    }


    public static void first_degree_equation_solver(double a, double b) {
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No solution! (since a = 0)", "First degree equation solver", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("The solution for x is: %.2f", -b/a), "First degree equation solver", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void linear_system_solver(double D, double D1, double D2) {
        if (D == 0 && D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "The system has infinitely many solutions!", "Linear system solver", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (D == 0 && (D1 != 0 || D2 != 0)) {
            JOptionPane.showMessageDialog(null, "The system has no solution!", "Linear system solver", JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(null, String.format("The solution for x1 is: %.2f\nThe solution for x2 is: %.2f", D1/D, D2/D), "Linear system solver", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void quadratic_equation_solver(double a,double b,double c,double delta) {
        if (a == 0 && b == 0 && c == 0) {
            JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions!", "Quadratic equation solver", JOptionPane.INFORMATION_MESSAGE);
        }
        else if ((a == 0 && b == 0 && c != 0) || delta < 0) {
            JOptionPane.showMessageDialog(null, "The equation has no solution!", "Quadratic equation solver", JOptionPane.INFORMATION_MESSAGE);

        }
        else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, String.format("The solution for x is: %.2f", -c/b), "Quadratic equation solver", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (delta == 0) {
            JOptionPane.showMessageDialog(null, String.format("The double root for the equation is: %.2f", -b/(2*a)), "Quadratic equation solver", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (delta > 0) {
            JOptionPane.showMessageDialog(null, String.format("The two solutions for x are: %.2f and %.2f", (-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a)), "Quadratic equation solver", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

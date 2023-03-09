//write a java programto solve quadratic equations
import java.util.Scanner;

public class QuadraticEquationSolver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient of x^2: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient of x: ");
        double b = input.nextDouble();
        System.out.print("Enter the constant: ");
        double c = input.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The quadratic equation has no real roots.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The quadratic equation has one root: " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The quadratic equation has two roots: " + root1 + " and " + root2);
        }
    }
}
Enter the coefficient of x^2: 9
Enter the coefficient of x: 7
Enter the constant: 4
The quadratic equation has no real roots.

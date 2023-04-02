package csc.assignment;

import java.util.Scanner;

public class Assigment3 {

    public void solveQuadratic() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The root is " + x);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

}

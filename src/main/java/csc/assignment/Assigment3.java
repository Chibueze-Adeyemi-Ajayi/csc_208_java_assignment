package csc.assignment;

public class Assigment3 {

    public double[] solveQuadratic(int a, int b, int c) {
        double x1 = (b * (-1)) - Math.sqrt(((b * b) - 4 * a * c));
        x1 /= (2 * a);
        double x2 = (b * (-1)) - Math.sqrt(((b * b) - 4 * a * c));
        x2 /= (2 * a);
        return new double[] { x1, x2 };
    }

}

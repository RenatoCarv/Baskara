package baskara;

public class Baskara {

    public double formula(double a, double b, double c) {

        double delta = b * b - 4 * a * c;
        double x = -b + Math.sqrt(delta) / 2 * a;
        return x;
    }

}

package ss4.baitap;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double x) {
        this.a = x;
    }

    public void setB(double x) {
        this.b = x;
    }

    public void setC(double x) {
        this.c = x;
    }

    public double getDiscriminant() {
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        return discriminant;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5)) / 2 * a;
        return r2;
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1.0, 3, 1);
        System.out.print("discriminant: " + quadraticEquation.getDiscriminant() + "\n");
        System.out.print("root1: " + quadraticEquation.getRoot1() + "\n");

    }
}

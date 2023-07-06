package Polymorphism.MathOperation.task_01;

public class MathOperation {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return this.add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return this.add(a, b) + this.add(c, d);
    }

    public double add(double a, int b) {
        return a + b;
    }
    public double add(int b, double a) {
        return a + b;
    }
}

package Polymorphism.MathOperation.task_02;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (this.height + this.width);
        super.setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double area = this.height * this.width;
        super.setArea(area);
    }
}

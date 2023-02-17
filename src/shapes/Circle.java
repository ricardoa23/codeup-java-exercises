package shapes;

import util.Input;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }



    public double getArea() {
        double rad = this.getRadius();
        return Math.PI * Math.pow(rad, 2);
    }

    public double getCircumference() {
        double rad = this.getRadius();
        return 2 * Math.PI * rad;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a radius");
        Circle radius = new Circle(new Input().getDouble());
        System.out.println(radius.getRadius());
        System.out.println( radius.getCircumference());
        System.out.println(radius.getArea());

    }


}

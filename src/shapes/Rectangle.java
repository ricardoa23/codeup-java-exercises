package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }



    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    //
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        return (this.length * 2) + (this.width * 2);
//    }
//
//    public int getArea() {
//        return  this.length * this.width;
//    }



}

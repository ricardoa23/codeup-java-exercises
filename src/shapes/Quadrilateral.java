package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double length);


    @Override
    public double getArea() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getPerimeter() {
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

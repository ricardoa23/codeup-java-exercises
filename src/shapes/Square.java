package shapes;

class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
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
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    //
//    public int side;
//
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    public int getSide() {
//        return side;
//    }


}

package shapes;

class Square extends Rectangle {

    public int side;


    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}

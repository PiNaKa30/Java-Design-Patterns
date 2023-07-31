package StructuralPatterns.Adapter;

public class SquarePeg {

    private int side;

    public SquarePeg() {}

    public SquarePeg(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}

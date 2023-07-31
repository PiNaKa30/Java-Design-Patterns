package StructuralPatterns.Adapter;

public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public SquarePeg getSquarePeg() {
        return squarePeg;
    }

    public void setSquarePeg(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius(){
        if(squarePeg == null)
            return 0;
        return squarePeg.getSide() * Math.sqrt(2);
    }

}

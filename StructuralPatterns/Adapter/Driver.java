package StructuralPatterns.Adapter;

public class Driver {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(10);

        RoundPeg smallRoundPeg = new RoundPeg(5);
        RoundPeg largeRoundPeg = new RoundPeg(12);

        hole.fits(smallRoundPeg);
        hole.fits(largeRoundPeg);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePegAdapter smallSquareAdapter = new SquarePegAdapter(smallSquarePeg);
        hole.fits(smallSquareAdapter);

        SquarePeg largeSquarePeg = new SquarePeg(12);
        SquarePegAdapter largeSquareAdapter = new SquarePegAdapter(largeSquarePeg);
        hole.fits(largeSquareAdapter);

    }

}

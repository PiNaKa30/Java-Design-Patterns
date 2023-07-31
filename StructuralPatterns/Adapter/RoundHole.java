package StructuralPatterns.Adapter;

public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public void fits(RoundPeg peg){
        if (peg.getRadius() < this.radius){
            System.out.println("It fits");
        } else {
            System.out.println("It doesn't fit");
        }
    }

}

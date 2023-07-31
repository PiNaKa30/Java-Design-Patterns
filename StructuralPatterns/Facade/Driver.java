package StructuralPatterns.Facade;

public class Driver {

    public static void main(String[] args) {

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawSquare();

    }

}

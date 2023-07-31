package StructuralPatterns.Facade;

public class ShapeFacade {

    private Shape circle;
    private Shape square;

    public ShapeFacade(){
        this.circle = new Circle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawSquare(){
        square.draw();
    }

}

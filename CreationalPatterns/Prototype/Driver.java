package CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Shape> list = new ArrayList<>();

        Circle c1 = new Circle();
        c1.x = 10;
        c1.y = 20;
        c1.color = "RED";
        c1.radius = 30;
        Circle c2 = new Circle(c1);
        Circle c3 = (Circle) c1.clone();

        Rectangle r1 = new Rectangle();
        r1.x = 10;
        r1.y = 20;
        r1.color = "RED";
        r1.length = 30;
        r1.width = 40;
        Rectangle r2 = new Rectangle(r1);
        Rectangle r3 = (Rectangle) r1.clone();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(r1);
        list.add(r2);
        list.add(r3);

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++) {
                System.out.printf("i: %d, j: %d%n", i, j);
                isSame(list.get(i), list.get(j));
            }
        }

    }

    private static void isSame(Shape a, Shape b){
        if(a.equals(b)) System.out.println("Same shapes");
        else System.out.println("Different shapes");
    }

}

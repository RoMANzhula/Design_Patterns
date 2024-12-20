package structural_patterns.bridge_pattern;

public class Main {

    public static void main(String[] args) {
        ShapeAbstract circle1 = new Circle(new VectorRenderer());
        circle1.draw();

        ShapeAbstract circle2 = new Circle(new RasterRenderer());
        circle2.draw();
    }

}

package structural_patterns.flyweight_pattern;

public class Main {

    public static void main(String[] args) {
        Shape circle1 = ShapeFlyweightFactory.getCircle();
        circle1.draw("Yellow");

        Shape circle2 = ShapeFlyweightFactory.getCircle();
        circle2.draw("Blue");
    }

}

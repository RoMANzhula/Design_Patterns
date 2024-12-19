package creational_patterns.factory_method_pattern;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CiRCle");
        if (shape1 != null) shape1.draw(); // output: Draw a circle.

        Shape shape2 = ShapeFactory.getShape("sqUAre");
        if (shape2 != null) shape2.draw(); // output: Draw a square.

        Shape shape3 = ShapeFactory.getShape(null);
        shape3.draw(); // java.lang.NullPointerException
    }

}

package structural_patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFlyweightFactory {

    private static final Map<String, Shape> shapes = new HashMap<>();

    // here we get existing object so as not to create a new one (a little bit like memoization)
    public static Shape getCircle() {
        if (!shapes.containsKey("Circle")) {
            shapes.put("Circle", new Circle());

            System.out.println("Creating new Circle object.");
        }

        return shapes.get("Circle");
    }

}

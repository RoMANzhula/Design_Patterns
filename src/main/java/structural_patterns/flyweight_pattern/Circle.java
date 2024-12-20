package structural_patterns.flyweight_pattern;

public class Circle implements Shape {

    private String intrinsicState = "Circle";

    @Override
    public void draw(String color) {
        System.out.println("Drawing " + intrinsicState + " with color " + color);
    }

}

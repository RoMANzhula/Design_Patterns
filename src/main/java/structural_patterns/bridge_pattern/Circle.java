package structural_patterns.bridge_pattern;

public class Circle extends ShapeAbstract {

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.render("Circle"); // render from parent-class
    }

}

package structural_patterns.bridge_pattern;

public abstract class ShapeAbstract {

    protected Renderer renderer;

    public ShapeAbstract(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();

}

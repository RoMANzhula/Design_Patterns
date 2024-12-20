package structural_patterns.bridge_pattern;

public class RasterRenderer implements Renderer {

    @Override
    public void render(String shape) {
        System.out.println("Rendering " + shape + " as pixels.");
    }

}

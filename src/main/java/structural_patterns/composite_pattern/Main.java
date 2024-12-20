package structural_patterns.composite_pattern;

public class Main {

    public static void main(String[] args) {
        CompositeGraphic compositeGraphic = new CompositeGraphic();

        compositeGraphic.add(new Circle());
        compositeGraphic.add(new Rectangle());

        System.out.println("Drawing composite:");
        compositeGraphic.draw();
    }

}

    // Output:
//Drawing composite:
//Drawing a Circle
//Drawing a Rectangle
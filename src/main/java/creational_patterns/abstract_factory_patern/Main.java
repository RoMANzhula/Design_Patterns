package creational_patterns.abstract_factory_patern;

public class Main {

    public static void main(String[] args) {
        FurnitureAbstractFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn(); // output: Sit on the modern chair.
        table.placeItems(); // output: Put items on the modern table.
    }

}

package creational_patterns.builder_pattern;

public class Main {

    public static void main(String[] args) {
        House house = new House.Builder()
                .setFoundation("Concrete Foundation")
                .setStructure("Wooden Structure")
                .setRoof("Metal Roof")
                .build()
        ;

        house.showDetails();
    }

}

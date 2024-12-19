package creational_patterns.abstract_factory_patern;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

}

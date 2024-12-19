package creational_patterns.prototype_pattern;

public class ConcretePrototype implements Prototype {

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    public void showName() {
        System.out.println("Name: " + name);
    }

}

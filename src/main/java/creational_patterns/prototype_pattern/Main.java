package creational_patterns.prototype_pattern;

public class Main {

    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype Name 1");
        prototype1.showName(); // output: Name: Prototype Name 1

        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        prototype2.showName(); // output: Name: Prototype Name 1
    }

}

package behavioral_patterns.visitor_pattern;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Element> elements = List.of(new ConcreteElementA(), new ConcreteElementB());
        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }

}

// Output:
//Processing ConcreteElementA
//Processing ConcreteElementB

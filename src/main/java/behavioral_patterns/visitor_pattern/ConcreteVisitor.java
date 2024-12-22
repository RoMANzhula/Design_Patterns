package behavioral_patterns.visitor_pattern;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Processing ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Processing ConcreteElementB");
    }

}

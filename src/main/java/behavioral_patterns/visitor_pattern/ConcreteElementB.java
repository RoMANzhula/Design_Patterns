package behavioral_patterns.visitor_pattern;

public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

package behavioral_patterns.visitor_pattern;

public interface Visitor {

    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);

}

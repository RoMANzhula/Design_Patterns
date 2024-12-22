package behavioral_patterns.visitor_pattern;

public interface Element {

    void accept(Visitor visitor);

}

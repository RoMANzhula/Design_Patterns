package behavioral_patterns.interpreter_pattern;

public class Main {

    public static void main(String[] args) {
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");
        Expression isProgramming = new OrExpression(isJava, isPython);

        System.out.println("Is it a programming language? " + isProgramming.interpret("Java"));
        System.out.println("Is it a programming language? " + isProgramming.interpret("Python"));
        System.out.println("Is it a programming language? " + isProgramming.interpret("Cacao"));
    }

}

// Output:
//Is it a programming language? true
//Is it a programming language? true
//Is it a programming language? false

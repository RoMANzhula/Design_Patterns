package behavioral_patterns.memento_pattern;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Memento memento;

        originator.setState("State 1"); //State is set: State 1
        memento = originator.saveSateToMemento();

        originator.setState("State 2"); //State is set: State 2
        originator.getStateFromMemento(memento); //State is restored: State 1
    }

}

// Output:
//State is set: State 1
//State is set: State 2
//State is restored: State 1

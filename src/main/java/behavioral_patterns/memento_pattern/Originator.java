package behavioral_patterns.memento_pattern;

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("State is set: " + state);
    }

    public Memento saveSateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
        System.out.println("State is restored: " + state);
    }

}

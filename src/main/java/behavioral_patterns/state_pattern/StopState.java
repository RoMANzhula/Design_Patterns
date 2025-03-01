package behavioral_patterns.state_pattern;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The System is stopped.");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }

}

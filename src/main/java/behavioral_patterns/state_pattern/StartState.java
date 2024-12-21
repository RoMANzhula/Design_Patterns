package behavioral_patterns.state_pattern;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The System is starting.");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }

}

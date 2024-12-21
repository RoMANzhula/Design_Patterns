package behavioral_patterns.state_pattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current state: " + context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current state: " + context.getState());
    }

}

// Output:
//The System is starting.
//Current state: Start State
//The System is stopped.
//Current state: Stop State

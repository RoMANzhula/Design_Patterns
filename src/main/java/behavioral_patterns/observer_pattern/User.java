package behavioral_patterns.observer_pattern;

public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " got message: " + message);
    }

}

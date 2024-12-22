package behavioral_patterns.mediator_pattern;

public class User extends Colleague {

    public User(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("User is sending: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("User received: " + message);
    }

}

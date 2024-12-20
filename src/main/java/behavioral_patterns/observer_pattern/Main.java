package behavioral_patterns.observer_pattern;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer user1 = new User("Bob");
        Observer user2 = new User("Rita");

        subject.addObserver(user1);
        subject.addObserver(user2);

        subject.notifyObservers("The system is updated!");

        subject.removeObserver(user2);

        subject.notifyObservers("We removed user2(Rita)");
    }

}

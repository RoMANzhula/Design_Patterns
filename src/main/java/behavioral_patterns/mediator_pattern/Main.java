package behavioral_patterns.mediator_pattern;

public class Main {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();

        Colleague user1 = new User(chatMediator);
        Colleague user2 = new User(chatMediator);

        chatMediator.addColleague(user1);
        chatMediator.addColleague(user2);

        user1.send("Hi!");
        user2.send("Hello, how are you?");
    }

}

// Output:
//User is sending: Hi!
//User received: Hi!
//User is sending: Hello, how are you?
//User received: Hello, how are you?

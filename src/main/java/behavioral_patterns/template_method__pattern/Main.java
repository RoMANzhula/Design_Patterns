package behavioral_patterns.template_method__pattern;

public class Main {

    public static void main(String[] args) {
        Game game = new Football();

        game.play();

        game = new Volleyball();
        game.play();
    }

}

// Output:
//Football: Initialize game.
//Football: Start game.
//Football: End game.
//Volleyball: Initialize game.
//Volleyball: Start game.
//Volleyball: End game.

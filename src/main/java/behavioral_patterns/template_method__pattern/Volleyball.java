package behavioral_patterns.template_method__pattern;

public class Volleyball extends Game {

    @Override
    void initialize() {
        System.out.println("Volleyball: Initialize game.");
    }

    @Override
    void startPlay() {
        System.out.println("Volleyball: Start game.");
    }

    @Override
    void endPlay() {
        System.out.println("Volleyball: End game.");
    }

}

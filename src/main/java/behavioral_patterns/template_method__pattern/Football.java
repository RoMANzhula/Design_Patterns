package behavioral_patterns.template_method__pattern;

public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football: Initialize game.");
    }

    @Override
    void startPlay() {
        System.out.println("Football: Start game.");
    }

    @Override
    void endPlay() {
        System.out.println("Football: End game.");
    }

}

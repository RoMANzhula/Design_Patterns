package behavioral_patterns.chane_of_responsibility__pattern;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request <= 10) {
            System.out.println("Handler A processed the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

}

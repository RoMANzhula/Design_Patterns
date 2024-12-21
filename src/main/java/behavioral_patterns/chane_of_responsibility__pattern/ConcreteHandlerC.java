package behavioral_patterns.chane_of_responsibility__pattern;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request > 20) {
            System.out.println("Handler C processed the request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

}

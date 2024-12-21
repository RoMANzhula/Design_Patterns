package behavioral_patterns.chane_of_responsibility__pattern;

public class Main {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        handlerA.handleRequest(5); // Handler A processed the request: 5
        handlerA.handleRequest(15); // Handler B processed the request: 15
        handlerA.handleRequest(25); // Handler C processed the request: 25
    }

}

// Output
//Handler A processed the request: 5
//Handler B processed the request: 15
//Handler C processed the request: 25

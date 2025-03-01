package behavioral_patterns.chane_of_responsibility__pattern;

public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int request);

}

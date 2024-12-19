package creational_patterns.singleton_pattern;

public class Singleton {

    // static var to saving one specimen
    private static Singleton instance;

    // private constructor to prohibit/avoid object creation
    private Singleton() {}

    // method to get specimen
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("This is the Singleton object.");
    }

}

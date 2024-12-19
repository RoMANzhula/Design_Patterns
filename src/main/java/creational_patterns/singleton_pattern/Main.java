package creational_patterns.singleton_pattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage(); // output: This is the Singleton object.

        // output: Singleton() has private access in creational_patterns.singleton_pattern.Singleton
        //Singleton singleton1 = new Singleton();
    }

}

package structural_patterns.proxy_pattern;

public class Main {

    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("photo.jpg");

        image.display(); // loading and displaying (creating and displaying)
        System.out.println("=====================");
        image.display(); // only displaying (because the object is created, and proxy works when object is created (example - @Lazy in Spring)

        System.out.println();
        System.out.println("Resetting the Proxy...");
        System.out.println();

        image.reset();

        image.display();
        System.out.println("=====================");
        image.display();

    }

}

// output
//Loading photo.jpg
//Displaying photo.jpg
//=====================
//Displaying photo.jpg
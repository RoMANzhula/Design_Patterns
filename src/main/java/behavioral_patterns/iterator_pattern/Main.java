package behavioral_patterns.iterator_pattern;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Bob", "Jina", "Tom", "Coco"};
        Iterator<String> iterator = new NameIterator(names);

        while (iterator.hasNext()) {
            System.out.println("Name: " + iterator.next());
        }
    }

}

// Output:
//Name: Bob
//Name: Jina
//Name: Tom
//Name: Coco

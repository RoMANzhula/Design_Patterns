package behavioral_patterns.iterator_pattern;

public class NameIterator implements Iterator<String> {

    private String[] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return  index < names.length;
    }

    @Override
    public String next() {
        return hasNext() ? names[index++] : null;
    }

}

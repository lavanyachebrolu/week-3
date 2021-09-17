public class Base {
    private String name;

    public Base(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

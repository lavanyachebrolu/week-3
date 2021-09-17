public abstract class Cake {
    private String name;
    private Base base;
    private Topping topping;

    public Cake(String name) {
        this.name = name;
    }

    public abstract String getToppingType();

    public String getName() {
        return name;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return name + " with " + base + " with " + topping + " topping";
    }

}

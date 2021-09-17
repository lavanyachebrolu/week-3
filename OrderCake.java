public class OrderCake implements Command {
    private Cake cake;
    private String type;

    public OrderCake(String type) {
        this.cake = null;
        this.type = type;
    }

    @Override
    public void execute() {
        if (type.toLowerCase().contains("chocolate")) {
            cake = new ChocolateCake();
        } else if (type.toLowerCase().contains("vanilla")) {
            cake = new VanillaCake();
        }

        PrepareCake prepareCake = new PrepareCake(cake);
        prepareCake.execute();
    }

    public Cake getCake() {
        return cake;
    }
}

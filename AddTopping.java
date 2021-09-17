public class AddTopping implements Command {
    private Cake cake;

    public AddTopping(Cake cake) {
        this.cake = cake;
    }

    public void execute() {
        System.out.println("Adding topping");
        Topping topping = null;
        if (cake.getToppingType().equals("chocolate")) {
            topping = new ChocolateTopping();
        } else if (cake.getToppingType().equals("vanilla")) {
            topping = new VanillaTopping();
        }
        cake.setTopping(topping);
    }
}

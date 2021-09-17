public class PrepareCake implements Command {
    private Cake cake;

    public PrepareCake(Cake cake) {
        this.cake = cake;
    }

    public void execute() {
        System.out.println("Preparing " + cake.getName());

        PrepareBase prepareBase = new PrepareBase(cake);
        prepareBase.execute();

        AddTopping addTopping = new AddTopping(cake);
        addTopping.execute();
    }
}

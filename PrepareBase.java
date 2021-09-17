public class PrepareBase implements Command {
    private Cake cake;

    public PrepareBase(Cake cake) {
        this.cake = cake;
    }

    public void execute() {
        System.out.println("Preparing base");
        Base cakeBase = new Base("Sponge base");
        cake.setBase(cakeBase);
    }
}

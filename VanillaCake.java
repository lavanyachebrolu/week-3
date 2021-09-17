public class VanillaCake extends Cake {
    private String toppingType;

    public VanillaCake() {
        super("Vanilla Cake");
        toppingType = "vanilla";
    }

    public String getToppingType() {
        return toppingType;
    }
}

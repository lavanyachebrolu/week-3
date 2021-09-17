public class ChocolateCake extends Cake {
    private String toppingType = "chocolate";
    
    public ChocolateCake() {
        super("Chocolate Cake");
        toppingType = "chocolate";
    }

    public String getToppingType() {
        return toppingType;
    }
}

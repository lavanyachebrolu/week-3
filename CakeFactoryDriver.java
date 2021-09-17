public class CakeFactoryDriver {
    public static void main(String[] args) {
        OrderCake orderCake = new OrderCake("Chocolate cake");
        orderCake.execute();
        Cake cake = orderCake.getCake();
        System.out.println(cake + " ready.");

        orderCake = new OrderCake("Vanilla cake");
        orderCake.execute();
        cake = orderCake.getCake();
        System.out.println(cake + " ready.");
    }
}

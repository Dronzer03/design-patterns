public class PizzaClient {
    public static void main(String[] args) {
        Pizza veggieDelight = new VeggieDelight();
        System.out.println(veggieDelight.getCost());

        Pizza veggieCheese = new CheeseDecorator(veggieDelight);
        System.out.println(veggieCheese.getCost());

        Pizza paneerPizza = new PaneerPizza();
        System.out.println(paneerPizza.getCost());

        Pizza paneerJalapeno = new JalapenoDecorator(paneerPizza);
        System.out.println(paneerJalapeno.getCost());
    }
}

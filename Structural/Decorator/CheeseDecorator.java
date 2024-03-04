public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 10 + super.getCost();
    }
}

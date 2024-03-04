public class JalapenoDecorator extends PizzaDecorator {
    public JalapenoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return 15 + super.getCost();
    }
}

public class CoffeeBeverage extends BeverageTemplate {
    @Override
    public void addMilk() {
        System.out.println("Don't!!");
    }

    @Override
    public void addSugar() {
        System.out.println("Might add!");
    }

    @Override
    public void addBeverageContent() {
        System.out.println("Add lot of coffee!");
    }
}

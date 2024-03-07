public class CoffeeBeverage extends BeverageTemplate {

    @Override
    protected void addMilk() {
        System.out.println("Don't!");
    }

    @Override
    protected void addSugar() {
        System.out.println("Might not add");
    }

    @Override
    protected void addBeverageContent() {
        System.out.println("Add lot of it!!");
    }
}

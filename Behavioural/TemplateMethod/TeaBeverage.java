public class TeaBeverage extends BeverageTemplate {

    @Override
    protected void addMilk() {
        System.out.println("Add Half Glass Milk");
    }

    @Override
    protected void addSugar() {
        System.out.println("Add 2 Teaspoon Sugar");
    }

    @Override
    protected void addBeverageContent() {
        System.out.println("Add Tea");
    }
}

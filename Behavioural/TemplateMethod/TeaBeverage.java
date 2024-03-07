public class TeaBeverage extends BeverageTemplate{
    @Override
    public void addMilk() {
        System.out.println("Add Half glass milk");
    }

    @Override
    public void addSugar() {
        System.out.println("Add 2 Teaspoon Sugar");
    }

    @Override
    public void addBeverageContent() {
        System.out.println("Add Tea");
    }
}

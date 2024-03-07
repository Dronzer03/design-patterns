public abstract class BeverageTemplate {
    private void addWater() {
        System.out.println("Adding water");
    }
    protected abstract void addMilk();
    protected abstract void addSugar();
    protected abstract void addBeverageContent();
    private void boil() {
        System.out.println("Boiling the Beverage");
    }
    private void serve() {
        System.out.println("Serve the beverage!");
    }

    // Template Method
    public final void prepareBeverage() {
        addWater();
        addMilk();
        addSugar();
        addBeverageContent();
        boil();
        serve();
    }
}

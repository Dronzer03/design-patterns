public abstract class BeverageTemplate {
    public void addWater() {
        System.out.println("Adding water");
    }
    public abstract void addMilk();
    public abstract void addSugar();
    public abstract void addBeverageContent();
    public void boil() {
        System.out.println("Boiling the Beverage");
    }
    public void serve() {
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

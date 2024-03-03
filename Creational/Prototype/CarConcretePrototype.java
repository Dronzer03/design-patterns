public class CarConcretePrototype implements CarPrototype{
    String brandName;
    String modelName;

    public CarConcretePrototype(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
    }

    @Override
    public void drive() {
        System.out.println("Driving the car " + brandName + " - " + modelName);
    }

    @Override
    public CarPrototype clone() {
        return new CarConcretePrototype(this.brandName, this.modelName);
    }
}

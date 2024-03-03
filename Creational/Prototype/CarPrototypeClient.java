public class CarPrototypeClient {
    public static void main(String[] args) {
        PrototypeRegistry registry = new PrototypeRegistry();

        CarPrototype carPrototype = new CarConcretePrototype("BMW", "M3");
        registry.registerPrototype("BMW-M3", carPrototype);

        CarPrototype clonedCarPrototype = registry.getPrototypeClone("BMW-M3");

        carPrototype.drive();
        clonedCarPrototype.drive();
    }
}

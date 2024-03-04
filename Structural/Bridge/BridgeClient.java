public class BridgeClient {
    public static void main(String[] args) {
        Car sedan = new SedanCar();
        Car suv = new SUVCar();

        BMWCars bmwSedan = new BMWCars(sedan);
        BMWCars bmwSUV = new BMWCars(suv);

        bmwSedan.createCar();
        bmwSUV.createCar();
    }
}

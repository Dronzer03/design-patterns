public class CarClient {
    public static void main(String[] args) {
        CarFactory BMWCarFactory = new BMWCarFactory();
        CarFactory KiaCarFactory = new KiaCarFactory();

        Sedan BMWSedanCar = BMWCarFactory.createSedan();
        SUV BMWSUVCar = BMWCarFactory.createSUV();

        Sedan KiaSedanCar = KiaCarFactory.createSedan();
        SUV KiaSUVCar = KiaCarFactory.createSUV();

        BMWSedanCar.driveSedan();
        BMWSUVCar.driveSUV();

        KiaSedanCar.driveSedan();
        KiaSUVCar.driveSUV();
    }
}

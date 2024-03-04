public class BMWCars implements CarBrand{
    Car car;

    public BMWCars(Car car) {
        this.car = car;
    }

    @Override
    public void createCar() {
        car.drive();
    }
}

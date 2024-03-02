public class BMWCarFactory implements CarFactory{
    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public SUV createSUV() {
        return new BMWSUV();
    }
}

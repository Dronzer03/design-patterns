public class KiaCarFactory implements CarFactory{
    @Override
    public Sedan createSedan() {
        return new KiaSedan();
    }

    @Override
    public SUV createSUV() {
        return new KiaSUV();
    }
}

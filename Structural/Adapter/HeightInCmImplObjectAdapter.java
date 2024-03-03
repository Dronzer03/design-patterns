// Object Adapter
public class HeightInCmImplObjectAdapter implements HeightInCm{
    HeightInInches heightInInches = new HeightInInchesImpl();
    @Override
    public double getHeightInCm() {
        return heightInInches.getHeightInInches() * 2.54;
    }
}

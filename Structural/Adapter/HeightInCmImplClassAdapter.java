// Class Adapter
public class HeightInCmImplClassAdapter extends HeightInInchesImpl implements HeightInCm{
    @Override
    public double getHeightInCm() {
        return getHeightInInches() * 2.54;
    }
}

import java.util.Random;

// Existing Implementation
public class HeightInInchesImpl implements HeightInInches{
    Random random = new Random();
    int min = 50;
    int max = 100;
    @Override
    public int getHeightInInches() {
        return random.nextInt(max - min + 1) + min;
    }
}

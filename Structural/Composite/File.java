import java.util.Random;

public class File implements FileSystemComponent{
    @Override
    public double getSize() {
        return new Random().nextDouble(50, 100);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ImageSourceFactory {
    Map<String, ImageSource> imageFactory = new HashMap<>();

    public ImageSource getImageSource(String fileName, String path) {
        ImageSource image = imageFactory.get(fileName);
        if (Objects.isNull(image)) {
            image = new ImageSource(path, fileName);
            imageFactory.put(fileName, image);
        }
        return image;
    }
}

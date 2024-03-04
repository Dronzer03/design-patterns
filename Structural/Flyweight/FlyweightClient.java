public class FlyweightClient {
    public static void main(String[] args) {
        ImageSourceFactory factory = new ImageSourceFactory();
        for (int i=0; i<10; i++) {
            ImageSource imageSource = factory.getImageSource("stars", "starsPath");
            Image image = new Image(i, i+10, imageSource);
            image.render();
        }
    }
}

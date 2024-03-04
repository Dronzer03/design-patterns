public class Image {
    private int x;
    private int y;
    private ImageSource imageSource;

    public Image(int x, int y, ImageSource imageSource) {
        this.x = x;
        this.y = y;
        this.imageSource = imageSource;
    }

    public void render() {
        imageSource.display(x, y);
    }
}

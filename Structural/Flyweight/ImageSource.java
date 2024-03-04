public class ImageSource {
    String filePath;
    String imageName;

    public ImageSource(String filePath, String imageName) {
        this.filePath = filePath;
        this.imageName = imageName;
    }
    public void display(int x, int y) {
        System.out.println("Rendering image " + imageName + " at " + x + "-" + y);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    List<FileSystemComponent> components = new ArrayList<>();

    @Override
    public double getSize() {
        double size = 0;
        for (FileSystemComponent file : components) {
            size += file.getSize();
        }
        return size;
    }

    public void addComponent(FileSystemComponent fileSystemComponent) {
        components.add(fileSystemComponent);
    }
}

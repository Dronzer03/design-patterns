public class CompositeClient {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addComponent(new File());
        directory.addComponent(new File());

        Directory parentDirectory = new Directory();
        parentDirectory.addComponent(directory);
        parentDirectory.addComponent(new File());
        parentDirectory.addComponent(new File());

        System.out.println("Directory size is : " + parentDirectory.getSize() + " MB");
    }
}

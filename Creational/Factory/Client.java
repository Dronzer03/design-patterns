public class Client {
    public static void main(String[] args) {
        SimpleShapeFactory simpleShapeFactory = new SimpleShapeFactory();
        Shape circle = simpleShapeFactory.createShape("Circle");
        Shape square = simpleShapeFactory.createShape("Square");

        circle.draw();
        square.draw();
    }
}

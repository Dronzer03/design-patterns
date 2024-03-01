// Concrete Creator
public class SimpleShapeFactory implements ShapeFactory {
    // I have initialised these objects with new objects
    // But if you are using spring, you can Autowire these objects and reuse without having to create new ones
    Circle circle = new Circle();
    Square square = new Square();

    @Override
    public Shape createShape(String shape) {
        if (shape.equals("Circle"))
            return circle;
        else if (shape.equals("Square"))
            return square;
        return null;
    }
}

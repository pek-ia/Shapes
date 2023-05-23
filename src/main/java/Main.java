import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(12);
        Shape s = new Square(12);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c);
        shapes.add(s);

        for (Shape shape: shapes){
            shape.draw();
        }
    }
}

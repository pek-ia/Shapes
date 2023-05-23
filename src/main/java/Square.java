public class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void draw() {
        System.out.println("I'm a square with area " + getArea());

    }

    @Override
    public double getArea() {
        return length * length;
    }
}

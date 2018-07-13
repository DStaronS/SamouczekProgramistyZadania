package pl.swieczkowski.zadania.interfejsy;

public class Rectangle implements Figure {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Obwód prostokąta wynosi: ");
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        System.out.print("Pole prostokąta wynosi: ");
        return length * width;
    }
}

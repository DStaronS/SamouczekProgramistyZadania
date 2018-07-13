package pl.swieczkowski.zadania.interfejsy;

public class Circle implements Figure {

    public final double PI = 3.14;
    private double radious;

    public double getRadius() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public Circle(double radious) {
        setRadious(radious);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Obwód koła wynosi: ");
        return 2 * PI * radious;
    }

    @Override
    public double getArea() {
        System.out.print("Pole koła wynosi: ");
        return PI * radious * radious;
    }

}

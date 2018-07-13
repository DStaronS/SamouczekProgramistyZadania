package pl.swieczkowski.zadania.interfejsy;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        double sum = (sideA * sideA) + (sideB * sideB);
        double sideC = Math.sqrt(sum);
        return sideC;
    }

    public Triangle(double sideA, double sideB) {
        setSideA(sideA);
        setSideB(sideB);
        getSideC();
    }

    @Override
    public double getPerimeter() {
        System.out.print("Obwód trójkąta wynosi: ");
        return sideA + sideB + getSideC();
    }

    @Override
    public double getArea() {
        System.out.print("Pole trójkąta wynosi: ");
        return sideA * sideB / 2;
    }

}

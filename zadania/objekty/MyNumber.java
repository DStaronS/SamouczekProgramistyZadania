package pl.swieczkowski.zadania.objekty;

public class MyNumber {
    private double number;


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public MyNumber(double number) {
        setNumber(number);
    }

    public boolean isOdd() {
        if (number % 2 != 0) {
            System.out.println("Liczba " + number + " jest nieparzysta");
        }
        return true;
    }

    public boolean isEven() {
        if (number % 2 == 0) {
            System.out.println("Liczba " + number + " jest parzysta");
        }
        return true;
    }

    public double sqrt() {
        double result = Math.sqrt(number);
        return result;
    }

    public double pow(MyNumber x) {
        new MyNumber(x.number);
        double result = Math.pow(number, x.number);
        return result;
    }

    public double add(MyNumber x){
        new MyNumber(x.number);
        double result = (number + x.number);
        return result;
    }

    public double subtract(MyNumber x){
        new MyNumber(x.number);
        double result = (number - x.number);
        return result;
    }

    @Override
    public String toString(){
        return "Liczba wynosi "+getNumber();
    }
}

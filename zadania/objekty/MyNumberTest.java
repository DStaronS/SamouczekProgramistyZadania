package pl.swieczkowski.zadania.objekty;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(4);

        System.out.println(myNumber.toString());
        myNumber.isEven();
        myNumber.isOdd();
        System.out.println("Potęga: " + myNumber.pow(myNumber));
        System.out.println("Pierwiastek: " + myNumber.sqrt());
        System.out.println("Suma: " + myNumber.add(myNumber));
        System.out.println("Różnica: " + myNumber.subtract(myNumber));
    }
}

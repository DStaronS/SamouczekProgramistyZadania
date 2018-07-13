package pl.swieczkowski.zadania.interfejsy;

import java.util.Scanner;

public class FigureTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Figure[] figure = new Figure[3];

        System.out.println("Podaj wymiary dwóch boków trójkąta równobocznego: ");
        figure[0] = new Triangle(input.nextDouble(),input.nextDouble());
        System.out.println("Podaj wymiar promienia koła:");
        figure[1] = new Circle(input.nextDouble());
        System.out.println("Podaj wymiary dwóch boków prostokąta: ");
        figure[2] = new Rectangle(input.nextDouble(), input.nextDouble());

        for(int i = 0; i < figure.length; i++){
            System.out.println(figure[i].getPerimeter());
            System.out.println(figure[i].getArea());
            System.out.println();
        }
    }

}

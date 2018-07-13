package pl.swieczkowski.zadania.metody;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {

        String name = getName();
        int age = getAge();

        System.out.println("Cześć " + name + "!");
        System.out.println("Twój wiek to: " + age);

        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        boolean wrongInput = true;
        while (wrongInput) {
            try {
                System.out.println("Podaj pierwszę liczbę:");
                number1 = input.nextInt();
                System.out.println("Podaj drugą liczbę:");
                number2 = input.nextInt();
                wrongInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niedozwolony znak. Spróbuj jeszcze raz!");
            } finally {
                input.nextLine();
            }
        }
        calculateNumbers(number1, number2);
        isEven(number1);
        isEven(number2);
        isDivisible(number1);
        boolean checkNumber = isDivisible(number1);

        if (checkNumber) {
            System.out.println("Liczba " + number1 + " jest podzielna przez 5 i 3");
        } else {
            System.out.println("Liczba " + number1 + "nie jest podzielna przez 5 i 3");
        }
        System.out.println("Liczba " + number1 + " podniesiona do potęgi 3 wynosi: " + riseToPower(number1));
        System.out.println("Pierwiastek kwadratowy z liczby " + number1 + " wynosi: " + calculateSquareRoot(number1));
        System.out.println();
        System.out.println("Podaj wymiary trójką.");
        wrongInput = true;
        int triangleA = 0;
        int triangleB = 0;
        int triangleC = 0;

        while (wrongInput) {
            try {
                System.out.println("Wymiar boku A: ");
                triangleA = input.nextInt();
                System.out.println("Wymiar boku B: ");
                triangleB = input.nextInt();
                System.out.println("Wymiar boku C: ");
                triangleC = input.nextInt();
                wrongInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niedozwolony znak. Spróbuj jeszcze raz!");

            } finally {
                input.nextLine();
            }
        }
        input.close();

        if ((triangleA < 1) || (triangleB < 1) || (triangleC < 1)) {
            throw new IllegalArgumentException("Liczba powinna być większa od 0");
        }

        boolean checkTrinagle = isRightTriangle(triangleA, triangleB, triangleC);


        if (checkTrinagle) {
            System.out.println("Trójkąt o bokach A = " + triangleA + ", B = " + triangleB + ", C = " + triangleC + " jest trójkątem równobocznym.");

        } else {
            System.out.println("Trójkąt o bokach A = " + triangleA + ", B = " + triangleB + ", C = " + triangleC + " nie jest trójkątem równobocznym.");

        }


    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoję imię:");
        String name = sc.nextLine();
        return name;
    }

    public static int getAge() {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();

        int birthYear = 0;
        int currentYear = 0;
        int yourAge;

        boolean wrongInput = true;

        while (wrongInput) {
            try {
                System.out.println("Podaj swój rok urodzenia:");
                birthYear = sc.nextInt();
                wrongInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niedozwolony znak. Spróbuj jeszcze raz!");
            } finally {
                sc.nextLine();
            }
        }
        currentYear = date.getYear() + 1900;
        yourAge = currentYear - birthYear;
        return yourAge;
    }

    public static void calculateNumbers(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba " + number + " jest parzysta.");
            return true;
        } else {
            System.out.println("Liczba " + number + " jest nieparzysta.");
            return false;
        }

    }

    public static boolean isDivisible(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
        }
        return true;
    }

    public static int riseToPower(int number) {
        int result = number * number * number;
        return result;
    }

    public static double calculateSquareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }

    public static boolean isRightTriangle(int sideA, int sideB, int sideC) {
        int longestSide;
        int shortSide1;
        int shortSide2;
        if(sideA > sideB && sideA > sideC){
            longestSide = sideA;
            shortSide1 = sideB;
            shortSide2 = sideC;
        } else if (sideB > sideC && sideB > sideA){
            longestSide = sideB;
            shortSide1 = sideC;
            shortSide2 = sideA;
        } else {
            longestSide = sideC;
            shortSide1 = sideA;
            shortSide2 = sideB;
        }
        return (shortSide1 * shortSide1) + (shortSide2 * shortSide2) == (longestSide* longestSide);

    }

}

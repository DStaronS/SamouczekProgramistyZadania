package pl.swieczkowski.zadania.petle;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Loops loop = new Loops();
        Scanner input = new Scanner(System.in);


        loop.printNumbers(input);
        loop.getDigits(input);
        loop.getReversedString(input);
        loop.getBinaryNumber(input);
        loop.isPalindrome(input);
        loop.getArray(input);
        loop.sortArray(input);
    }

    public void printNumbers(Scanner input) {
        int number;
        System.out.println("Podaj dowolną liczbę całkowitą większą od 0:");
        while (true) {
            try {
                number = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("wprowadziłeś niedozwolony znak, Spróbuj jeszcze raz. Podaj liczbę większą od O:");
                input.nextLine();
            }
        }
        if (number <= 0) throw new IllegalArgumentException("Wrowadziłeś liczbę mniejszą lub równą 0.");
        int i = 0;
        while (i <= number) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

    }

    public void getDigits(Scanner input) {
        int number;
        int reminder;
        System.out.println("Podaj dowolną liczbę całkowitą:");
        while (true) {
            try {
                number = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niedozwolony znak, Spróbuj jeszcze raz. Podaj dowolną liczbę:");
                input.nextLine();
            }
        }
        while (number != 0) {
            System.out.println(number % 10);
            number /= 10;
        }
        input.nextLine();


    }

    public void getReversedString(Scanner input) {
        String text;
        System.out.println("Wpisz dowolny tekst:");
        text = input.nextLine();
        char[] array = new char[text.length()];
        for (int i = text.length() - 1; i >= 0; i--) {
            array[i] = text.charAt(i);
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public void getBinaryNumber(Scanner input) {
        System.out.println("Podaj dowolną liczbę całkowitą większą od 0:");
        int number;
        int inputNumber;
        int reminder;
        String digits = "";
        while (true) {
            try {
                number = input.nextInt();
                inputNumber = number;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niedozwolony znak. Spróbuj jeszcze raz. Podaj dowolną liczbę:");
                input.nextLine();
            }
        }
        if (number <= 0) throw new IllegalArgumentException("Wrowadziłeś liczbę mniejszą lub równą 0.");
        while (number != 0) {
            reminder = number % 2;
            number /= 2;
            if (reminder == 1) {
                digits = "1" + digits;
            }
            if (reminder == 0) {
                digits = "0" + digits;
            }
        }
        System.out.println("Liczba " + inputNumber + " w systemie binarnym wynosi: " + digits);
        input.nextLine();
    }

    public boolean isPalindrome(Scanner input) {
        System.out.println("Wprowadź dowolny wyraz:");
        String word = input.nextLine();

        char[] wordArray = word.toCharArray();
        int half = wordArray.length / 2;
        char[] firstHalf = new char[half];
        char[] secondHalf = new char[half];
        int count = 0;

        for (int i = 0; i < half; i++) {
            firstHalf[i] = wordArray[i];
        }
        if (wordArray.length % 2 == 0) {
            for (int j = wordArray.length - 1; j > half - 1; j--) {
                secondHalf[count] = wordArray[j];
                count++;
            }
        } else {
            for (int j = wordArray.length - 1; j > half; j--) {
                secondHalf[count] = wordArray[j];
                count++;
            }
        }
        if (Arrays.equals(firstHalf, secondHalf)) {
            System.out.println("Wyraz " + word + " jest palindromem.");
            return true;
        } else {
            System.out.println("Wyraz " + word + " nie jest palindromem.");
            return false;
        }

    }

    public void getArray(Scanner input) {
        System.out.println("Podaj liczbę elementów tablicy:");
        int index = input.nextInt();
        int[] array = new int[index];
        int count = 0;
        while (count < array.length) {
            try {
                System.out.println("Podaj wartość liczbową elementu nr." + (count + 1));
                array[count] = input.nextInt();
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niepoprawny znak. Spróbuj jeszcze raz!");
                input.nextLine();
            }
        }
        System.out.println("Tablica jednowymiarowa z " + index + " elementów: " + Arrays.toString(array));
    }

    public void sortArray(Scanner input) {
        System.out.println("Podaj liczbę elementów tablicy:");
        int index = input.nextInt();
        int[] array = new int[index];
        int count = 0;
        while (count < array.length) {
            try {
                System.out.println("Podaj wartość liczbową elementu nr." + (count + 1));
                array[count] = input.nextInt();
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś niepoprawny znak. Spróbuj jeszcze raz!");
                input.nextLine();
            }
        }
        System.out.println("Oryginalna tablica: " + Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Posortowana tablica:" + Arrays.toString(array));
    }


}


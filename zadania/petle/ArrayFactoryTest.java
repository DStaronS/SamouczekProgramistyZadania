package pl.swieczkowski.zadania.petle;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactoryTest {
    public static void main(String[] args) {

        ArrayFactory arrayFactory = new ArrayFactory(10);
        int[] oneDimensionArray = arrayFactory.getOneDimensionArray();
        for (int i = 0; i < oneDimensionArray.length; i++) {
            oneDimensionArray[i] = i;
        }
        System.out.println("Tablica jednowymiarowa: " + Arrays.toString(oneDimensionArray));
        System.out.println();
        int[][] twoDimensionArray = arrayFactory.getTwoDimensionArray();
        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j<twoDimensionArray[i].length; j++){
                    twoDimensionArray[i][j] = j;
                }

        }
        System.out.println("Tablica dwuwymiarowa: " + Arrays.deepToString(twoDimensionArray));

        arrayFactory.build2DArray();

    }

}







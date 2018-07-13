package pl.swieczkowski.zadania.petle;

public class ArrayFactory {
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int[] getOneDimensionArray() {
        return new int[index];
    }

    public int[][] getTwoDimensionArray() {
        return new int[index][index];
    }

    public int[][] build2DArray() {
        int[][] array = getTwoDimensionArray();
        System.out.println("Macierz jednostkowa:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i + 1; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    public ArrayFactory(int index) {
        setIndex(index);
    }

}

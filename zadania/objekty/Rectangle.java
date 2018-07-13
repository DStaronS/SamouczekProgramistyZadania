package pl.swieczkowski.zadania.objekty;

public class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int wieght) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(int width, int height){
        int area = width * height;
        return area;
    }

    public int getPerimeter(int width, int height){
        int perimeter = (2 * width) + (2 * height);
        return perimeter;
    }

    public double getDiagonal(int width, int height) {
        double temp = (width * width) + (height * height);
        double diagonal = Math.sqrt(temp);
        return diagonal;
    }
}

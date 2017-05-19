package Java2;

/**
 * Created by micahdisney on 5/19/17.
 */

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {

        return length * width;
    }


}
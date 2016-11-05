/**
 * Created by Lizzi on 04.11.2016.
 */
package d;
public class Rectangle extends Shape {
   protected double width=1.0;
    protected double length=1.0;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double length) {

        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {

        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    @Override
    public String toString() {
        return
                "width=" + width +
                ", length=" + length + super.toString();
    }

    public double getArea(){
        return width*length;

    }

    public double getPerimetr(){

        return 2*width+2*length;
    }
}


package d;
import static java.lang.Math.pow;

/**
 * Created by Lizzi on 04.11.2016.
 */

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {

        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    public double getArea() {
        return Math.PI*pow(radius,2);

    }
    public double getPerimetr(){

        return Math.PI*radius*2;
    }
}

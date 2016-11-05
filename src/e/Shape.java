/**
 * Created by Lizzi on 04.11.2016.
 */
package e;
public abstract class Shape {
    protected String color="red";
    protected boolean filled=true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    public Shape() {

    }
    public abstract double getPerimetr();
    public abstract double getArea();


}

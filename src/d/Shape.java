/**
 * Created by Lizzi on 04.11.2016.
 */
package d;
public class Shape {
    private String color="red";
    private boolean filled=true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                " color='" + color + '\'' +
                ", filled=" + filled ;
    }

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
}

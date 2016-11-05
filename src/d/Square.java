/**
 * Created by Lizzi on 04.11.2016.
 */
package d;
public class Square extends Rectangle{
    public Square() {
    }


    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square( double side){

        super(side,side);
    }


    public double getSide() {
        return length;
    }

    public void setSide(double side){
        width=side;
        length=side;

    }
    public void setWidth(double side){
        width=side;


    }
    public void setLength(double side){

        length=side;

    }

    @Override
    public String toString() {
        return "Square{ side =" + width +

                " color= " + this.getColor() +
                ", filled=" + this.isFilled()+"}";}
    }


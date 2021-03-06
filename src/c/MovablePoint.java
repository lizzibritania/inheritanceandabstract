/**
 * Created by Lizzi on 04.11.2016.
 */
package c;
public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public void setSpeed( float xSpeed, float ySpeed)
    {this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return  super.toString()+" speed = (" +
                xSpeed +
                ", " + ySpeed +
                ") " ;
    }

    public float[] getSpeed()

    {float[] speed=new float[2];
        speed[0]=xSpeed;
        speed[1]=ySpeed;
        return speed;}

    public MovablePoint move()

    {this.setXY(this.getX()+xSpeed,this.getY()+ySpeed);
        return this;}
}

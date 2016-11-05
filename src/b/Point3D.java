/**
 * Created by Lizzi on 04.11.2016.
 */
package b;
public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+this.getX()+", "+this.getY()+", "+this.getZ()+")";
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z)

    {
        this.setX(x);
        this.setY(y);
        this.z=x;



    }

    public float[] getXYZ()
    {float[] xyz=new float[3];
        xyz[0]=this.getX();
        xyz[1]=this.getY();
        xyz[2]=this.getZ();
        return xyz;
    }
}

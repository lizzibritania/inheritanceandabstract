/**
 * Created by Lizzi on 01.11.2016.
 */
import a.*;
import b.*;
import c.*;
import d.*;
import d.Circle;
import d.Rectangle;
import d.Shape;
import e.*;
import e.Square;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("Alladin", "street");
        System.out.println(person.toString());
        Student student=new Student("VAs","street2","FIIT",2010,983048320.2321);
        System.out.println(student.toString());
        Staff staff=new Staff("VAs","street2","mo",3892948.0);
        System.out.println(staff.toString());

        Person staffer=new Staff("VAsyaaaa","street2","mo",3892948.0);
        System.out.println(staffer.toString());
        System.out.println(staffer instanceof Person);
        System.out.println(staffer instanceof Person);

        Point2D point2D=new Point2D(5,4);
        System.out.println(point2D);
        Point2D point2D1=new Point3D(2,3,4);
        System.out.println(point2D1);
        Point3D point3D=new Point3D(1,2,4);
        System.out.println(point3D);
        System.out.println(point2D instanceof Point3D);
        System.out.println(point2D1 instanceof Point3D);
        MovablePoint movablePoint=new MovablePoint(8,8,9,9);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        System.out.println(movablePoint instanceof Point);
Point point=new MovablePoint(1,5,3,3);
        System.out.println(point);
        System.out.println(point instanceof MovablePoint);
        Point truepoint=new Point(1,4);
        System.out.println(truepoint);
        truepoint=(Point) point;
        System.out.println(truepoint);
        System.out.println(truepoint instanceof MovablePoint);

       d. Shape shape=new d.Shape();
        System.out.println(shape);
        d.Rectangle rectangle=new Rectangle(1,3);
        System.out.println(rectangle);
        d.Square square=new d.Square(7);
        System.out.println(square);
        d.Circle circle=new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());
        Shape shape1=new Circle();
        System.out.println(shape1.isFilled());
        Shape shape2=new Rectangle("blue",true,4,4);
        System.out.println(shape2);
        System.out.println(circle instanceof Shape);
        System.out.println(rectangle instanceof Shape);

        e.Circle circle1=new e.Circle();
        e.Rectangle rectangle1=new e.Rectangle();
        e.Square square1=new Square();
        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(square1);
        System.out.println(square1 instanceof e.Shape);
        System.out.println(circle1 instanceof e.Shape);
        System.out.println(rectangle1 instanceof e.Shape);
        e.Rectangle square2=new Square(2);
        System.out.println(square2);
        System.out.println(square2 instanceof Square);
        square2= (e.Rectangle) square2;
        System.out.println(square2 instanceof Square);


    }
}

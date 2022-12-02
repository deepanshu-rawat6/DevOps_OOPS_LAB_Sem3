import java.util.Scanner;

interface Shape{
    double pi=3.142;
    double area(double r,double h);
    double vol(double r,double h);
}
class Cylinder implements Shape{

    @Override
    public double area(double r, double h) {
        return (2*pi*r*h)+(2*pi*r*r);
    }

    @Override
    public double vol(double r, double h) {
        return pi*r*r*h;
    }
}
class Cone implements Shape{

    @Override
    public double area(double r, double h) {
        return pi*r*(r+Math.sqrt(r*r+h*h));
    }

    @Override
    public double vol(double r, double h) {
        return pi*r*r*(h/3);
    }
}
public class Shapes_3D {
    public static void main(String[] args) {
        Cylinder ob1=new Cylinder();
        Cone ob2=new Cone();
        Scanner sc=new Scanner(System.in);
        double r1=sc.nextDouble();
        double h1=sc.nextDouble();
        System.out.println("Area of the Cylinder: "+ob1.area(r1,h1));
        System.out.println("Volume of the Cylinder: "+ob1.vol(r1,h1));
        double r2=sc.nextDouble();
        double h2=sc.nextDouble();
        System.out.println("Area of the Cone: "+ob2.area(r2,h2));
        System.out.println("Volume of the Cone: "+ob2.vol(r2,h2));
    }
}


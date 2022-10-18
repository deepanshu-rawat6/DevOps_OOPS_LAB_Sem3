interface Const{
    double r = 5.0;
    double h = 10.0;
    double pi = 3.142;
    void area();
    void volume();
}
public class Computing implements Const {
//    Area and Volume for Cylinder
    @Override
    public void area() {
        double ans = (2*pi*r*h)+(2*pi*r*r);
        System.out.println("Area : "+ans);
    }

    @Override
    public void volume() {
        double ans = pi*r*r*h;
        System.out.println("Volume : "+ans);
    }
}
class Test_Exp2{
    public static void main(String[] args) {
        Computing obj=new Computing();
        obj.area();
        obj.volume();
    }
}

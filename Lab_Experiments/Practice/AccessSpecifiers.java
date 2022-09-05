class A{
    private int a=10;
    int b=20;
    static int sum(){
        return a+b;
    }
}
//We cannot access private vars in static methods
//Private vars cannot be access in Main methods because its static
//They can only be access in class methods
public class AccessSpecifiers {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(sum());
//        System.out.println(obj.a+obj.b);
//        obj.b=5;
//        System.out.println(obj.sum());
//        obj.a=2;
//        System.out.println(obj.sum());
    }
}

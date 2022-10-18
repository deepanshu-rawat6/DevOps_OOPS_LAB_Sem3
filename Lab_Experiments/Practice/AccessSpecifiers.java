class AB{
    private int a=10;
    int b=20;
    int sum(){
        return a+b;
    }
}
//We cannot access private vars in static methods
//Private vars cannot be access in Main methods because its static
//They can only be access in class methods
public class AccessSpecifiers {
    public static void main(String[] args) {
        AB obj=new AB();
        System.out.println(obj.sum());
//        System.out.println(obj.a+obj.b);
//        obj.b=5;
//        System.out.println(obj.sum());
//        obj.a=2;
//        System.out.println(obj.sum());
    }
}

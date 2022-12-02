interface X{
    void display1();
}
interface Y{
    void display1();
}
class Middle implements X,Y{

    @Override
    public void display1() {
        System.out.println("This function belongs to Interface X and Y");
    }
}
public class Multi_Test {
    public static void main(String[] args) {
        Middle obj=new Middle();
        obj.display1();
    }
}

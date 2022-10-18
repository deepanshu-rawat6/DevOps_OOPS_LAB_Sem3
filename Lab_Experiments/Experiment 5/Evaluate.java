interface Operations{
    void division(int a, int b);
    void modulo(int a, int b);
}
public class Evaluate implements Operations {
    @Override
    public void division(int a, int b) {
        System.out.println("Quotient : " + ((double)a / b));
    }

    @Override
    public void modulo(int a, int b) {
        System.out.println("Modules : " + a % b);
    }
}
class Test_Exp3{
    public static void main(String[] args) {
        Evaluate obj = new Evaluate();
        obj.division(20,5);
        obj.modulo(5,4);
        obj.division(100,3);
        obj.modulo(1,4);
    }
}

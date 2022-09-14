interface Cal{
    float div(int a,int b);
    int mod(int a,int b);
}
public class Math implements Cal {
    @Override
    public float div(int a, int b) {
        return (float)a/b;
    }

    @Override
    public int mod(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {
        Math obj=new Math();
        System.out.println(obj.div(20,5));
        System.out.println(obj.mod(5,4));
    }
}

import java.util.Scanner;

interface Test{
     int square(int a);
}

class Arithmetic implements Test{
    public int square(int a){
        return a*a;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(obj.square(a));
    }
}

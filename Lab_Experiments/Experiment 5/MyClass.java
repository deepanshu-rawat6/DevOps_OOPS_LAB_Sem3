import java.util.Scanner;

interface A{
    void meth1(int x);
    void meth2(int x);
}

public class MyClass implements A{
    @Override
    public void meth1(int x) {
//      checks if number is even or odd
        if((x&1)==1){
            System.out.println("\nThe number is :Odd");
        }else{
            System.out.println("\nThe number is : Even");
        }
    }

    @Override
    public void meth2(int x) {
//        checks if number is a power of 2
        if((x&(x-1))==0){
            System.out.println("\nThe number is a power of 2");
        }else{
            System.out.println("\nThe number is not a power of 2");
        }
    }
}
class Test_Exp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be checked for even/odd :");
        int a=sc.nextInt();
        System.out.println("Enter number to be checked whether it's a power of 2 or not :");
        int b=sc.nextInt();
        MyClass obj=new MyClass();
        obj.meth1(a);
        obj.meth2(b);
    }
}

import java.util.Scanner;

public class Factorial {
    void Cal(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            throw new ArithmeticException("Cannot calculate!");
        }else{
            System.out.println(Fact(n));
        }
    }
    int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }

    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.Cal();
    }
}

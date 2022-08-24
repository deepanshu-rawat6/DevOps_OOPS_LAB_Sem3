import java.util.Scanner;

public class Permutations {
    void compute(){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
    }
    public static void main(String[] args) {
        Permutations obj=new Permutations();
        obj.compute();
    }
}

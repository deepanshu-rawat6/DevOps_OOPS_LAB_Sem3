import java.util.Scanner;

public class Square_Num {
    void compute(){
        int[] arr=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i]*arr[i];
        }
        System.out.println("The sum of the square of these numbers:"+sum);
    }
    public static void main(String[] args) {
        Square_Num obj=new Square_Num();
        obj.compute();
    }
}

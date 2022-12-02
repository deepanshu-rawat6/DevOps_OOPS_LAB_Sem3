import java.util.Scanner;

class Exception_zero {
    public void division(int a,int b) {
        try {
            int q = a / b;
            System.out.println("\nThe division of a by b : "+q);
        } catch(ArithmeticException e) {
            System.out.println("\nDivision by zero detected please enter valid numbers to perform division!");
            System.out.println(e.getMessage());
        }
    }
}
public class Division_by_zero {
    public void helper(){
        Exception_zero obx = new Exception_zero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        obx.division(a,b);
    }
    public static void main(String[] args) {
        Division_by_zero obj = new Division_by_zero();
        obj.helper();
    }
}

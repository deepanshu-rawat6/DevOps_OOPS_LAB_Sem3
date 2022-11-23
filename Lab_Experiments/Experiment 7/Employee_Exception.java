import java.io.IOException;
import java.util.Scanner;
class Exception_Employee {
    public void input() throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        try{
            name = sc.nextLine();
            age = sc.nextInt();
            if(!name.matches("[a-zA-z]")) {
                throw new IOException();
            }
            if (age > 50) {
                System.out.println("The age entered is greater than 50!");
                throw new Exception();
            }
            Exception_Employee obj = new Exception_Employee();
            System.out.println("Object is created!");
        }
        catch(Exception e) {
            System.out.println("Exception found!");
            System.out.println("Please enter the valid details");
        }
    }
}
public class Employee_Exception extends Exception_Employee {
    public static void main(String[] args) throws Exception {
        Employee_Exception obx = new Employee_Exception();
        obx.input();
    }
}

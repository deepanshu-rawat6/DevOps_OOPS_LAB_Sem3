import java.io.IOException;
import java.util.Scanner;
class Exception_Employee {
    Exception_Employee() {
        /*
        if this line executes at the starting of the program, then it is meant for main method of Class Employee_Exception
        to call the function "input()" of Class Exception_Employee for further computation
         */
        System.out.println("\nThis code is inside the constructor, hence object was created!");
    }
    public void input() throws Exception {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        try{
            System.out.println("\nEnter the employee name: ");
            name = sc.nextLine();
            System.out.println("Enter the age of the employee: ");
            age = sc.nextInt();
            if(!name.matches("[a-zA-z]+")) {
                System.out.println("Enter name without any numerics");
                throw new IOException();
            }
            if (age > 50) {
                System.out.println("The age entered is greater than 50!");
                throw new Exception();
            }
            Exception_Employee obj = new Exception_Employee();
//            System.out.println("Object is created!");
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

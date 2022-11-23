import java.util.Scanner;
public class Car_Collision  {

    public void compute(String direction1,String direction2) throws Exception {
        try{
            if (!direction1.equals(direction2)) {
                throw new Exception();
            }
            System.out.println("\nCar are travelling in same direction, hence chances of collision are less!");
        } catch (Exception e) {
            System.out.println("\nVehicles are travelling in opposite direction, so chances of collision are more!");
        }
    }
    public void input() throws Exception {
        String model1,direction1,model2,direction2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the details of Car 1");
        model1 = sc.nextLine();
        direction1 = sc.nextLine();
        System.out.println("\nEnter the details of Car 2");
        model2 = sc.nextLine();
        direction2 = sc.nextLine();
        compute(direction1,direction2);
    }
    public static void main(String[] args) throws Exception {
        Car_Collision obx = new Car_Collision();
        obx.input();
    }
}

package Custom;

public class Arr_Display {
    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        display(new int[]{-1,-1});
    }
}

package Custom;

import java.util.Arrays;

import static Custom.Arr_Display.display;

public class Test_Class {
    public void Arr(){
        int[] arr = {1,10,5,4,3};
        System.out.println("Array before sorting : ");
        display(arr);
        Arrays.sort(arr);
        System.out.println("Array after sorting : ");
        display(arr);
    }
    public static void main(String[] args) {
        Test_Class obj = new Test_Class();
        obj.Arr();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Frequency_Index_of_Char {
    public void compute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int freq = 0;
        int len = str.length();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < len ; i++) {
            if (str.charAt(i) == 'a') {
                freq++;
                index.add(i);
            }
        }
        System.out.println("\nLength of my name : "+len);
        System.out.println("Frequency of 'a' : "+freq);
        System.out.println("Indices of 'a' : "+index);
    }
    public static void main(String[] args) {
        Frequency_Index_of_Char obj = new Frequency_Index_of_Char();
        obj.compute();
    }
}

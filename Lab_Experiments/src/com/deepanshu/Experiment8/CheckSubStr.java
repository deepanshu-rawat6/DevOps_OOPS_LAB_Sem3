
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CheckSubStr {
    public List<Integer> CheckingSubstr(){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.println("\nEnter the string : ");
        String str = sc.nextLine();
        System.out.println("\nEnter the substring : ");
        String substr = sc.nextLine();
        int len = str.length();
        int sub_len = substr.length();
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i = 0; i < len; i++ ) {
            int j = sub_len + i;
            if (j >= len + 1 ) {
                break;
            }
            if (str.substring(i, j).equals(substr)) {
                index.add(i);
                index.add(j);
                break;
            }
        }
        for (int i = len ; i >= 0 ; i-- ) {
            int j = i - sub_len;
            if (j <= -1 ) {
                break;
            }
            if (str.substring(j,i).equals(substr)) {
                index.add(j);
                index.add(i);
                break;
            }
        }
        return index;
    }
    public void result() {
        ArrayList<Integer> ans = (ArrayList<Integer>) CheckingSubstr();
        System.out.println(ans);
    }
    public static void main(String[] args) {
        CheckSubStr obj = new CheckSubStr();
        obj.result();
    }
}

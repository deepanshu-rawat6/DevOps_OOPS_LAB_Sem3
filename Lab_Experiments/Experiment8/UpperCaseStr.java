import java.util.Scanner;

public class UpperCaseStr {
    public void UpperCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                sb.append((char)(ch - 32));
            }else{
                sb.append(ch);
            }
        }
        System.out.println("\nThe processed string: \n" + sb.toString());
    }
    public static void main(String[] args) {
        UpperCaseStr obj = new UpperCaseStr();
        obj.UpperCase();
    }
}

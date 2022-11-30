import java.util.Scanner;

public class UpperCaseString {
    public void UpperCase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                sb.append((char)(ch - 32));
            }else{
                sb.append(ch);
            }
        }
        System.out.println("\nThe processed string: \n" + sb);
    }
    public static void main(String[] args) {
        UpperCaseString obj = new UpperCaseString();
        obj.UpperCase();
    }
}

class Exception_isNonNumeric extends Exception {
    Exception_isNonNumeric(){
        super("The value entered here is non-numeric");
    }
}
public class Exception_nonNumeric {
    public static boolean check_for_string(String p,String q) {
        try {
            int a = Integer.parseInt(p);
            int b = Integer.parseInt(q);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            if (check_for_string(args[0],args[1])) {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                System.out.println("Modulus of " + x + " and " + y + ": " +(x%y));
            } else {
                throw new Exception_isNonNumeric();
            }
        } catch (Exception_isNonNumeric e) {
            System.out.println(e);
        }
    }
}

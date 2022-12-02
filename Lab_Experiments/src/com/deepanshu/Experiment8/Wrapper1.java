public class Wrapper1 {
    public void compute(){
        int i = 20;
        Integer ob = new Integer(10);
        String s = "15";
        int_to_Integer(i);
        Integer_to_String(ob);
        String_to_int(s);
        int_to_String(i);
        String_to_Integer(s);
        Integer_to_int(ob);
    }
    public void int_to_Integer(int x) {
        Integer I = x;
        System.out.println("int : " + x + " to Integer : " + I);
    }
    public void Integer_to_String(Integer I) {
        String str = I.toString();
        System.out.println("Integer : " + I + " to String : " + str);
    }
    public void String_to_int(String str) {
        int x = Integer.parseInt(str);
        System.out.println("String : " + str + " to int : " + x);
    }
    public void int_to_String(int x) {
        String str = String.valueOf(x);
        System.out.println("int : " + x + " to String : " + str);
    }
    public void String_to_Integer(String str) {
        Integer I = Integer.valueOf(str);
        System.out.println("String : " + str + " to Integer : " + I);
    }
    public void Integer_to_int(Integer I) {
        int x = I.intValue();
        System.out.println("Integer : " + I + " to int : " + x);
    }
    public static void main(String[] args) {
        Wrapper1 obj = new Wrapper1();
        obj.compute();
    }
}

public class Wrapper2 {
    public void compute(){
        float f = 20.2f;
        Float ob = new Float(10.5);
        String s = "15.9";
        float_to_Float(f);
        Float_to_String(ob);
        String_to_float(s);
        float_to_String(f);
        String_to_Float(s);
        Float_to_float(ob);
    }
    public void float_to_Float(float f) {
        Float F = f;
        System.out.println("float : " + f + " to Float : " + F);
    }
    public void Float_to_String(Float F) {
        String str = F.toString();
        System.out.println("Float : " + F + " to String : " + str);
    }
    public void String_to_float(String str) {
        float x = Float.parseFloat(str);
        System.out.println("String : " + str + " to float : " + x);
    }
    public void float_to_String(float x) {
        String str = String.valueOf(x);
        System.out.println("float : " + x + " to String : " + str);
    }
    public void String_to_Float(String str) {
        Float F = Float.valueOf(str);
        System.out.println("String : " + str + " to Float : " + F);
    }
    public void Float_to_float(Float F) {
        float x = F.floatValue();
        System.out.println("Float : " + F + " to float : " + x);
    }
    public static void main(String[] args) {
        Wrapper2 obj = new Wrapper2();
        obj.compute();
    }
}
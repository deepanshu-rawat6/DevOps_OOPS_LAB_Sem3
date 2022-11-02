public class Wrapper1 {
    public void compute(){
        int i = 2;
        Integer ob = new Integer(i);
        System.out.println(ob);
    }
    public static void main(String[] args) {
        Wrapper1 obj = new Wrapper1();
        obj.compute();
    }
}

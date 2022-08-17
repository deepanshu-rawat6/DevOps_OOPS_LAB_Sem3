public class Classes_and_Objects {
    int var=0;
    Classes_and_Objects(){
        var++;
        System.out.println("This runs inside constructor:"+var);
    }
    boolean even_or_odd(int a){
        return (a&1)==0;
    }
    public static void main(String[] args) {
        Classes_and_Objects obj=new Classes_and_Objects();
        int a=Integer.parseInt(args[0]);
        System.out.println("Even:"+obj.even_or_odd(a));
    }
}

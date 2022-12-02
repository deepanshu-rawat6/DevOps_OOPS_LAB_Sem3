public class Command_Line_Cal {
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    int product(int a,int b){
        return a*b;
    }
    float quotient(int a,int b){
        return (float)a/b;
    }
    int mod(int a,int b){
        return a%b;
    }
    public static void main(String[] args) {
        Command_Line_Cal obj=new Command_Line_Cal();
        System.out.println("Command Line Calculator:\n");
        System.out.println("Addition:"+obj.add(100,5));
        System.out.println("Subtraction:"+obj.subtract(100,5));
        System.out.println("Multiplication:"+obj.product(100,5));
        System.out.println("Division:"+obj.quotient(100,5));
        System.out.println("Modulo:"+obj.mod(100,5));
    }
}

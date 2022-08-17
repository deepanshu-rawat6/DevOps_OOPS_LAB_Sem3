public class Command_Line_Cal_with_inputs {
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
        Command_Line_Cal_with_inputs obj=new Command_Line_Cal_with_inputs();
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Command Line Calculator:\n");
        System.out.println("Addition:"+obj.add(a,b));
        System.out.println("Subtraction:"+obj.subtract(a,b));
        System.out.println("Multiplication:"+obj.product(a,b));
        System.out.println("Division:"+obj.quotient(a,b));
        System.out.println("Modulo:"+obj.mod(a,b));
    }
}

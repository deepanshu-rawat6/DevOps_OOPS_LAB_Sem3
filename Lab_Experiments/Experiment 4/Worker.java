public class Worker {
    String name;
    String ID;
    Worker(String name,String ID){
        this.name=name;
        this.ID=ID;
    }
    void display(){
//        Function to display Worker's info
        System.out.println("\n");
        System.out.println("Name of the Worker: "+this.name);
        System.out.println("Worker's ID: "+this.ID);
    }
}
class DailyWorker extends Worker{
    int sal_rate;
    DailyWorker(String name, String ID,int sal_rate) {
        super(name,ID);
        this.sal_rate=sal_rate;
    }
    void ComPay(int hrs){
        super.display();
        System.out.println("Weeks Pay: "+sal_rate*hrs);
    }
}
class SalariedWorker extends Worker{
    int sal_rate;
    SalariedWorker(String name,String ID,int sal_rate){
        super(name,ID);
        this.sal_rate=sal_rate;
    }
    void ComPay(){
        super.display();
        System.out.println("Weeks Pay: "+40*sal_rate);
    }
}
class Compute{
    public static void main(String[] args) {
        DailyWorker ob1=new DailyWorker("ABC","5001",5);
        ob1.ComPay(50);
        SalariedWorker ob2=new SalariedWorker("XYZ","5002",10);
        ob2.ComPay();
    }
}

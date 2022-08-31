import java.util.Scanner;

public class Employee {
    String name;
    int JS;
    int BS;
    Employee(String n,int bs,int js){
        name=n;
        JS=js;
        BS=bs;
    }
    double calc_Gross(int sal){
//        System.out.println(this.BS);
        double hra=(0.1)*(BS);
        double da=(0.5)*(BS);
        double ta=(0.05)*(BS);
        return (this.BS)+hra+da+ta+sal;
    }
    double calc_Gross(){
        double ta=(0.05)*BS;
        return BS+ta;
    }
    void calc_netsal(){
        double GS=0;
        if(JS==1){
//            Permanent
            GS=calc_Gross(5000);
        }else{
//            Probation
            GS=calc_Gross();
        }
        double it=calc_IT(GS);
        double pf=(0.12)*GS;
        double Net_sal=GS-it-pf;
        printing(Net_sal);
    }
    double calc_IT(double gs){
        if(gs>100000) return (0.3)*gs;
        else if(gs>=50000) return (0.1)*gs;
        else return 0;
    }
    void printing(double NS){
        System.out.println();
        System.out.println("Employee Name: "+name);
        if(JS==1){
            System.out.println("Job Status: Permanent");
        }else{
            System.out.println("Job Status: Probation");
        }
        System.out.println("Basic Salary: "+BS);
        System.out.println("Net Salary: "+NS);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee Name:");
        String n=sc.nextLine();
        System.out.print("Base Salary:");
        int bs=sc.nextInt();
        System.out.print("Enter 1 for Permanent or 2 for Probation:");
        int j=sc.nextInt();
        Employee obj=new Employee(n,bs,j);
        obj.calc_netsal();
    }
}

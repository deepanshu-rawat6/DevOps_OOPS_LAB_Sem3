class Employee{
    String name;
    int empid;
    int salary;
    Employee(String name,int empid,int salary){
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }
    public void employeeDetails(Employee obj){
        System.out.println(obj.name+" "+String.valueOf(obj.salary));
    }
    public void increaseSalary(Employee obj,int incrementPerc){
        obj.salary=obj.salary+(((incrementPerc)*obj.salary)/100);
    }
}
class Manager extends Employee{
    Manager(String name, int empid, int salary) {
        super(name, empid, salary);
    }

    public static void main(String[] args) {
        Manager manager=new Manager("",0,0);
        Employee employee=new Employee("Deepanshu",5001,10000);
        String test="";
        manager.employeeDetails(employee);
        System.out.println(test);
        manager.increaseSalary(employee,10);
        manager.employeeDetails(employee);
        System.out.println("\nUpdated Salary:"+employee.salary);
    }

}
class PrivateMember {
    private int a;
    PrivateMember(int b){
        this.a=b;
    }
    void display(){
        System.out.println(this.a);
    }
}
class Check extends PrivateMember{
    Check(){
        super(10);
    }
    void printing(){
        System.out.println("This is inside derived class");
//        Cannot be accessed because private members are visible only to inside class in which they are declared
//        System.out.println("Var:"+super.a);
    }
    public static void main(String[] args) {
        Check obj = new Check();
       obj.display();
       obj.printing();
    }
}

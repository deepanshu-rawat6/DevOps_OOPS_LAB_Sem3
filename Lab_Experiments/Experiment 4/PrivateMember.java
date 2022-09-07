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
//        System.out.println("Var:"+super.a);
    }
    public static void main(String[] args) {
        Check obj=new Check();
       obj.display();
       obj.printing();
    }
}

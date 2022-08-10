public class Constructor {
    int count=0;
    Constructor(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Constructor c1=new Constructor();
        Constructor c2=new Constructor();
        Constructor c3=new Constructor();
    }
}
//The memory space of each object is different so that's why after generation of each object value only 1 is printed

//But if we declare count as "static" so the memory space is shared amongst the objects so that's why 1 2 3 is printed
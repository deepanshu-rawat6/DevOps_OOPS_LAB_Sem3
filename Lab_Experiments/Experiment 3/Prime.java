public class Prime {
    boolean prime_inefficient(int x){
        int i=2;
        if(x==1) return false;
        while(i<x){
            if(x%i==0) return false;
            i++;
        }
        return true;
    }
    boolean prime_efficient(int x){
        int i=2;
        if(x==1) return false;
        while(i*i<x){
            if(x%i==0) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Prime obj=new Prime();
//        System.out.println(obj.prime_efficient(8));
        System.out.println(obj.prime_inefficient(7));
    }
}

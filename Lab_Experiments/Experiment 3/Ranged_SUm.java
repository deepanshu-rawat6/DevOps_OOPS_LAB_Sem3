
public class Ranged_SUm {
    void compute(){
        int i=45;
        int sum=0;
        while(i<250){
            sum+=i;
            i+=5;
        }
        System.out.println("The sum of all integers greater than 40 and less than 250 that are divisible by 5: "+sum);
    }
    public static void main(String[] args) {
        Ranged_SUm obj=new Ranged_SUm();
        obj.compute();
    }
}

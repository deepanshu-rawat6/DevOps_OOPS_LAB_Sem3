
public class Ranged_SUm {
    int compute(){
        int i=45;
        int sum=0;
        while(i<250){
            sum+=i;
            i+=5;
        }
        return sum;
//        System.out.println("The sum of all integers greater than 40 and less than 250 that are divisible by 5: "+sum);
    }
    int calc(int x){
        if(x==40) return 0;
        return x+calc(x-5);
    }
    public static void main(String[] args) {
        Ranged_SUm obj=new Ranged_SUm();
        long start = System.nanoTime();

        // call the method
        int ans=obj.calc(245);
        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
//        obj.compute();
//        System.out.println(obj.calc(245));
        long start1 = System.nanoTime();

        // call the method
        int t=obj.compute();

        // get the end time
        long end1 = System.nanoTime();

        // execution time
        long execution1 = end1 - start1;
        System.out.println("Execution time by recursion: " + execution + " nanoseconds");
        System.out.println("Execution time by iteration: " + execution1 + " nanoseconds");

        System.out.println("Output:"+ans);

    }
}

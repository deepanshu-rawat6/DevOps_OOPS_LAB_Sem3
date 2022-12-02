class Counter1{
    static int count = 0;
    public void incr(){
        count++;
    }
}
public class Thread_three {
    public static void main(String[] args)throws InterruptedException {

        Counter1 c = new Counter1();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<10; i++)
                    c.incr();
            }
        });
        t1.start();
        t1.join();
        System.out.println("Count = " + Counter1.count);
    }
}
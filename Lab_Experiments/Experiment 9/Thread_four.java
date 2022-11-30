class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Inside run method!");
    }
}

public class Thread_four {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        System.out.println("\nPrinting the initial priority of the threads:");
        System.out.println("The priority of the t1 : " + t1.getPriority());
        System.out.println("The priority of the t2 : " + t2.getPriority());
        System.out.println("The priority of the t3 : " + t3.getPriority());

        System.out.println("\nNow, setting priority for the threads:");
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(10);

        System.out.println("\nNow, checking the status of the threads:");
        t1.start();
        if(t1.isAlive()) {
            System.out.println("Thread-1 is alive!");
        } else {
            System.out.println("Thread-1 is not alive!");
        }
        t2.start();
        if(t2.isAlive()) {
            System.out.println("Thread-2 is alive!");
        } else {
            System.out.println("Thread-2 is not alive!");
        }
        Thread.sleep(1000);
        t3.start();
        if(t3.isAlive()) {
            System.out.println("Thread-3 is alive!");
        } else {
            System.out.println("Thread-3 is not alive!");
        }
    }
}
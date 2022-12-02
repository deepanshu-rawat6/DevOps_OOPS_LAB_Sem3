class Extending_Thread_Class extends Thread {
    public void run() {
        System.out.println("This function is executing because thread is running");
    }
}

class Implementing_Runnable_Interface implements Runnable {

    @Override
    public void run() {
        System.out.println("The code is running in a thread\n");
    }
}

public class Thread_one extends Thread {
    public void run() {
        System.out.println("This function is executing because thread is running");
    }
    public static void main(String[] args) {
        Extending_Thread_Class obj = new Extending_Thread_Class();
        obj.start();
        System.out.println("This code is outside the thead");


        Implementing_Runnable_Interface obx = new Implementing_Runnable_Interface();
        Thread thread = new Thread(obx);
        thread.start();
        System.out.println("\nThis code is outside the thead");

    }
}

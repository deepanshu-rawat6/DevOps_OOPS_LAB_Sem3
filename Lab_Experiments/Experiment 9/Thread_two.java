class Even extends Thread {
//    Thread t;
    Even () {
//        t = new Thread(this);
        start();
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if ((i&1) != 1) {
                System.out.println(i);
            }
        }
    }
}

class Odd extends Thread {
//    Thread t;
    Odd () {
//        t = new Thread(this);
        start();
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if ((i&1) == 1) {
                System.out.println(i);
            }
        }
    }
}


public class Thread_two {
    public static void main(String[] args) {
        Even ob1 = new Even();
        Odd ob2 = new Odd();
    }
}

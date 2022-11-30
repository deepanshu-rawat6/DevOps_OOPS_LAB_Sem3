class Increment extends Thread {
    static int c = 0;
    Increment () {
        start();
    }

    @Override
    public void run() {
        c++;

    }
}

public class Thread_three {
    public static void main(String[] args) {

    }
}

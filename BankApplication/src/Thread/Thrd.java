package Thread;

public class Thrd extends Thread{
    @Override
    public void run() {
        System.out.println("new thread");
    }

    public static void main(String[] args) {
        Thrd t=new Thrd();
        t.start();
    }
}

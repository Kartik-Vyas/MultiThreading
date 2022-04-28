
class test1 implements Runnable{
    public void run()
    {
        System.out.println("thread created by Runnable interface");
    }
}
public class ThreadCreationByRunnable {
    public static void main(String[] args) {
        test1 t1 = new test1();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}

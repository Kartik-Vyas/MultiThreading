
class test extends Thread
{
    public void run()
    {
        System.out.println("thread created");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        test t = new test();
        t.start();
    }
}

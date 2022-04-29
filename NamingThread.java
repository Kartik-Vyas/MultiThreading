
class name extends Thread
{
    public void run()
    {
        System.out.println("thread name");
        System.out.println(Thread.currentThread().getName());
    }
}
public class NamingThread {
    public static void main(String[] args) {
        name n = new name();
        n.start();
        System.out.println("in main");
        System.out.println(Thread.currentThread().getName());
    }
}

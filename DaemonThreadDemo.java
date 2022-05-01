
class A extends Thread
{
    synchronized public void run()
    {
        System.out.println("This is daemon Thread");
        System.out.println(isDaemon());
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args)
    {
        Thread.currentThread().setName("kartik");
        // note:- we cannot declare main thread as daemon thread as that thread is already being started hence it will throw Exception
        try
        {
            Thread.currentThread().setDaemon(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("main thread");
        A a = new A();
        a.setDaemon(true);
        a.start();
    }
}

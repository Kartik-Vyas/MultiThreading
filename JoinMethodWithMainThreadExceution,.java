

public class JoinMethodWithMainThreadExceution extends Thread
{
    static Thread mainThread;
    public void run()
    {
        for(int i = 1;i<=5;i++)
        {
            try
            {
                mainThread.join();
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException
    {
        mainThread = Thread.currentThread();
        JoinMethodWithMainThreadExceution mj = new JoinMethodWithMainThreadExceution();
        mj.start();

        for(int i = 1;i<=5;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

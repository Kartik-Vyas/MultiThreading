
class Join extends Thread{
    public void run()
    {
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

public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException
    {
        Join j = new Join();
        j.start();
        j.join();

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

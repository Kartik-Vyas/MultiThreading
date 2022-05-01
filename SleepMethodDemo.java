class Sleep extends Thread
{
    public void run()
    {
        for(int i =1; i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class SleepMethodDemo {
    public static void main(String[] args) {
        //note:- here main Thread will execute normally while sleep will occur in Thread-0
        Sleep s = new Sleep();
        s.start();
    }
}

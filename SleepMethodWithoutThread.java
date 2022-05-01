

class SleepWithoutThread
{
    public void run()
    {
        for(int i =1; i<=5;i++)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + "  " + i);
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class SleepMethodWithoutThread {
    public static void main(String[] args) {
        //note:- Since there is no thread Created the main method will run by excecuting one object at a time 
        SleepWithoutThread t1 = new SleepWithoutThread();
        t1.run();
        SleepWithoutThread t2 = new SleepWithoutThread();
        t2.run();
    }
}

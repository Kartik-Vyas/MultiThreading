

class Sleep2 extends Thread
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
public class SleepMethodDemo2 {
    public static void main(String[] args) {
        //note:- here since both thread will run simultaneously hence the output will take time of only 5sec.
        //While normally without thread if we call run method then it will take 10sec.
        Sleep2 t1 = new Sleep2();
        t1.start();
        Sleep2 t2 = new Sleep2();
        t2.start();
    }
}

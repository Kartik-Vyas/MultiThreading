
class TotalEarnings extends Thread
{
    int Total = 0;
    public void run()
    {
        synchronized (this)
        {
            for (int i = 1; i <= 10; i++)
            {
                Total += 100;
                this.notify();
            }
        }
    }
}

class App
{
    public static void main(String[] args) throws InterruptedException
    {
        TotalEarnings t = new TotalEarnings();
        t.start();
        synchronized (t)
        {
        t.wait();
        System.out.println("Total earnings is " + t.Total +" Rs" );
        }
    }

}

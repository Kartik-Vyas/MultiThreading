import java.util.SortedMap;

class Medical extends Thread
{
    public void run()
    {
        try {
            System.out.println("Medical started");
            Thread.sleep(3000);
            System.out.println("Medical finished");
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class Driving extends Thread
{
    public void run()
    {
        try {
            System.out.println("Driving test started");
            Thread.sleep(5000);
            System.out.println("Driving test completed");
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread
{
    public void run()
    {
        try {
            System.out.println("files examine started");
            Thread.sleep(3000);
            System.out.println("files checked");
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class license
{
    public static void main(String[] args)throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();
        Thread.sleep(1000);

        Driving d = new Driving();
        d.start();
        d.join();
        Thread.sleep(1000);

        OfficerSign os = new OfficerSign();
        os.start();

    }
}


class Y extends Thread{
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

public class YieldDemo {
    public static void main(String[] args) {
        Y yd = new Y();
        yd.start();
        Thread.yield();
        //note:- yield method will stop main thread and let the Thread-0 run when the execution of thread-0 is finished then main thread will run
        // note:- it will depend on thread schedular weather to accept or reject the hint given by yield() method.
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

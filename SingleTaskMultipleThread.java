class task extends Thread
{
    public void run()
    {
        System.out.println("single task");
    }
}
public class SingleTaskMultipleThread {
    public static void main(String[] args) {
        task t1 = new task();
        t1.start();

        task t2 = new task();
        t2.start();
    }
}

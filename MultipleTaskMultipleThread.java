
class task1 extends Thread
{
    public void run()
    {
        System.out.println("task1");
    }
}
class task2 extends Thread
{
    public void run()
    {
        System.out.println("task2");
    }
}
public class MultipleTaskMultipleThread {
    public static void main(String[] args) {
        task1 t1 = new task1();
        t1.start();

        task2 t2 = new task2();
        t2.start();
    }
}

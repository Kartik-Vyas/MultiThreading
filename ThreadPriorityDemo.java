public class ThreadPriorityDemo extends Thread
{
    public void run()
    {
        System.out.println("child Thread");
        System.out.println("Priority of child thread:- " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println("priority before :" + Thread.currentThread().getPriority());
        ThreadPriorityDemo tp = new ThreadPriorityDemo();
        tp.start();
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("priority after :" + Thread.currentThread().getPriority());
    }

}

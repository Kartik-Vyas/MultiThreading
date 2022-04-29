
class Custom extends Thread
{
    public void run()
    {
        System.out.println("thread task");
        Thread.currentThread().setName("Programmer thread");
        System.out.println(Thread.currentThread().getName());

    }
}
public class SettingName {
    public static void main(String[] args) {
        System.out.println("Before name change : " + Thread.currentThread().getName());
        Custom thread = new Custom();
        thread.start();
        Thread.currentThread().setName("Main thread renamed by setName method");
        System.out.println("After name change : " + Thread.currentThread().getName());
        System.out.println(thread.isAlive());
    }
}

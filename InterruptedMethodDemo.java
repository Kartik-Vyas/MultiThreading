
class InterruptedMethod extends Thread {
    public void run() {
        try {
            System.out.println(Thread.interrupted());
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(Thread.interrupted());
    }
}
public class InterruptedMethodDemo {
    public static void main(String[] args) {
        InterruptedMethod im = new InterruptedMethod();
        im.start();
        im.interrupt();
    }
}



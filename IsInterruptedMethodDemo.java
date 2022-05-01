

class isInterruptedMethod extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().isInterrupted());
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
public class IsInterruptedMethodDemo {
    public static void main(String[] args) {
        isInterruptedMethod im = new isInterruptedMethod();
        im.start();
        im.interrupt();
    }
}



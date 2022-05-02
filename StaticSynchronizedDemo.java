class BookTickets
{
    static int totalSeats = 20;
    static synchronized void bookSeats(int seats)
    {
        if(totalSeats>= seats)
        {
            System.out.println("Booking successful  :" + Thread.currentThread().getName());
            totalSeats-=seats;
            System.out.println("seats booked " + seats);
            System.out.println("seats left " + totalSeats);
        }
        else
        {
            System.out.println("Booking unsuccessful  :" + Thread.currentThread().getName());
            System.out.println("seats left " + totalSeats);
        }
    }
}

class MyThread1 extends Thread
{
    BookTickets b;
    int seats;
    MyThread1(BookTickets b,int seats)
    {
        this.b= b;
        this.seats = seats;
    }

    public void run()
    {
    b.bookSeats(seats);
    }
}

class MyThread2 extends Thread
{
    BookTickets b;
    int seats;
    MyThread2(BookTickets b,int seats)
    {
        this.b= b;
        this.seats = seats;
    }

    public void run()
    {
        b.bookSeats(seats);
    }
}

public class StaticSynchronizedDemo {
    public static void main(String[] args) {

        BookTickets b1 = new BookTickets();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(b1, 6);
        t2.start();

        BookTickets b2 = new BookTickets();
        MyThread2 t3 = new MyThread2(b2, 9);
        t3.start();

        MyThread2 t4 = new MyThread2(b2, 6);
        t4.start();
    }
}

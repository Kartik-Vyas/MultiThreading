class BookTheaterSeat1
{
    int totalSeat = 10;
    void bookSeat1(int seats) {
        System.out.println(Thread.currentThread().getName() + " Other bookings");
        System.out.println(Thread.currentThread().getName() + " Other bookings");
        System.out.println(Thread.currentThread().getName() + " Other bookings");
        System.out.println(Thread.currentThread().getName() + " Other bookings");
        System.out.println(Thread.currentThread().getName() + " Other bookings");

        synchronized (this)
        {
            if (totalSeat >= seats)
            {
                System.out.println(seats + " seat booking successful");
                totalSeat = totalSeat - seats;
                System.out.println("seats left :" + totalSeat);
            }
            else
            {
                System.out.println(seats + " seat not booked");
                System.out.println("seats left: " + totalSeat);
            }

            System.out.println(Thread.currentThread().getName() + " Other bookings");
            System.out.println(Thread.currentThread().getName() + " Other bookings");
            System.out.println(Thread.currentThread().getName() + " Other bookings");
            System.out.println(Thread.currentThread().getName() + " Other bookings");
            System.out.println(Thread.currentThread().getName() + " Other bookings");
        }
    }
}
class BookingSeatApp extends Thread {
    static BookTheaterSeat1 b;
    int seats;

    public void run() {
        b.bookSeat1(seats);
    }

    public static void main(String[] args)
    {
        b = new BookTheaterSeat1();
        BookingSeatApp deepak = new BookingSeatApp();
        deepak.seats = 7;
        deepak.run();

        BookingSeatApp amit = new BookingSeatApp();
        amit.seats = 6;
        amit.run();

    }
}


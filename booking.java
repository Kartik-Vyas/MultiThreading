class BookTheaterSeat
{
    int totalSeat = 0;
    synchronized void bookSeat(int seats)
    {
        if(totalSeat>=seats)
        {
            System.out.println("seat booking successful");
            totalSeat = totalSeat-seats;
            System.out.println("seats left :" + seats);
        }
        else
        {
            System.out.println("seat not booked");
            System.out.println("seats left: " + seats);
        }
    }
}
class BookingApp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public class SynchronizedMethodDemo {
        public static void main(String[] args) {
            b = new BookTheaterSeat();
            BookingApp deepak = new BookingApp();
            deepak.seats = 7;
            deepak.run();

            BookingApp amit = new BookingApp();
            amit.seats = 6;
            amit.run();

        }
    }
}

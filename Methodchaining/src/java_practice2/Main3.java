package java_practice2;

class Ticket
{
    void print_ticket()
    {
        System.out.println("Ticket booked successfully");
    }
}

class Theatre
{
    Ticket select_seat()
    {
        Ticket t1 = new Ticket();
        return t1;
    }
}

class Booking
{
    Theatre book_ticket()
    {
        Theatre t1 = new Theatre();
        return t1;
    }
}

class Main3
{
    public static void main(String[] args)
    {
        Ticket t = new Booking().book_ticket().select_seat();
        t.print_ticket();
    }
}
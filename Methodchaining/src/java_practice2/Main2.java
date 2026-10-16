package java_practice2;

class Cab
{
    void start()
    {
        System.out.println("Cab started");
    }
}

class Driver
{
    Cab assign_cab()
    {
        Cab c1 = new Cab();
        return c1;
    }
}

class Uber
{
    Driver book()
    {
        Driver d1 = new Driver();
        return d1;
    }
}

class Main2
{
    public static void main(String[] args)
    {
        Cab c = new Uber().book().assign_cab();
        c.start();
    }
}
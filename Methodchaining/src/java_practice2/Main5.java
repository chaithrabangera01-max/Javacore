package java_practice2;

class Food
{
    void delivery()
    {
        System.out.println("Food delivered");
    }
}

class Restaurant
{
    Food order_food()
    {
        Food f1 = new Food();
        return f1;
    }
}

class Swiggy
{
    Restaurant order()
    {
        Restaurant r1 = new Restaurant();
        return r1;
    }
}

class Main5
{
    public static void main(String[] args)
    {
        Food f = new Swiggy().order().order_food();
        f.delivery();
    }
}
package java_practice2;

class Product
{
    void display()
    {
        System.out.println("Product selected");
    }
}

class Amazon
{
    Product select_product()
    {
        Product p1 = new Product();
        return p1;
    }
}

class Customer
{
    Amazon shop()
    {
        Amazon a1 = new Amazon();
        return a1;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Product p = new Customer().shop().select_product();
        p.display();
    }
}
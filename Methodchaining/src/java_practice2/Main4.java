package java_practice2;

class Account
{
    void check_balance()
    {
        System.out.println("Balance checked");
    }
}

class Bank
{
    Account login()
    {
        Account a1 = new Account();
        return a1;
    }
}

class ATM
{
    Bank insert_card()
    {
        Bank b1 = new Bank();
        return b1;
    }
}

class Main4
{
    public static void main(String[] args)
    {
        Account a = new ATM().insert_card().login();
        a.check_balance();
    }
}
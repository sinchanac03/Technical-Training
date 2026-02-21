package OOPS.ClassWithAttributes;

//important for interviews
public class BankAccount
{
    String accountHolder;
    double balance;
    BankAccount(String accountHolder,double balance)
    {
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        System.out.println("Deposited amount="+amount);
        balance+=amount;

    }
    void withdraw(double amount)
    {
        if (amount<=balance)
        {
            System.out.println("Amount withdrew="+amount);
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    void displayBalance()
    {
        System.out.println(accountHolder);
        System.out.println(balance);
    }
}
class Driver3
{
    public static void main(String[] args)
    {
        BankAccount ba1=new BankAccount("ABC",10000);
        ba1.deposit(400);
        ba1.withdraw(300);
        ba1.displayBalance();
    }
}

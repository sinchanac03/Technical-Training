public class StaticBlock
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
    static //gets executed even before main function
    {
        System.out.println("Hi");
    }
}

public class Swap_methods
{
    static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.println("Before swapping:\na="+a+"\nb="+b);
        swap(10,20);
        System.out.println("After swapping:\na="+a+"\nb="+b);
    }

}

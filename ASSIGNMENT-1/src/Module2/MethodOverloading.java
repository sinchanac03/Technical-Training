package Module2;

public class MethodOverloading
{
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public static double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Add 2 integers: " + add(5, 10));
        System.out.println("Add 3 integers: " + add(2, 4, 6));
        System.out.println("Add 2 doubles: " + add(2.5, 3.5));
    }
}
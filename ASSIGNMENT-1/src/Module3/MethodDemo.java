package Module3;

class Parent
{
    void display()
    {
        System.out.println("Parent display method");
    }
}

class Child extends Parent
{
    void display()
    {
        System.out.println("Child display method");
    }
}

class OverloadExample
{
    int add(int a, int b)
    {
        return a + b;
    }

    int add(int a, int b, int c)
    {
        return a + b + c;
    }
}

public class MethodDemo
{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        Child c = new Child();

        p.display();
        c.display();

        OverloadExample o = new OverloadExample();
        System.out.println("Add 2 numbers: " + o.add(5, 10));
        System.out.println("Add 3 numbers: " + o.add(2, 4, 6));
    }
}
package Threads.LambdaExpression.WithoutLambda;

interface Greeting
{
    void sayHello();
}
public class Demo
{
    public static void main(String[] args)
    {
        Greeting g=new Greeting()
        {
            public void sayHello()
            {
                System.out.println("Hello world");
            }
        };
        g.sayHello();
    }
}

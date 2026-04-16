package Threads.LambdaExpression.WithLambda;

interface Greeting
{
    void sayHello();
}
public class Demo
{
    public static void main(String[] args)
    {
        Greeting g=() ->
        {
            System.out.println("Hello world");
        }; //if the body is long then put curly braces if not it's not required

        g.sayHello();
    }
}




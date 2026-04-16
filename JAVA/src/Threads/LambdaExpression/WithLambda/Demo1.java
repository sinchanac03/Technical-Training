package Threads.LambdaExpression.WithLambda;




interface Calculator
{
    int add(int a,int b);
}
public class Demo1
{
    public static void main(String[] args)
    {
        Calculator c=(a,b) -> a+b;
        int result= c.add(10,20);
        System.out.println("Result= " + result);
    }
}


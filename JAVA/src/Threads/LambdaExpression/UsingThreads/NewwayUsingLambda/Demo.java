package Threads.LambdaExpression.UsingThreads.NewwayUsingLambda;

public class Demo
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(()-> System.out.println("My task1 is running"));
        Thread t2=new Thread(()-> System.out.println("My task2 is running"));
        t1.start();
        t2.start();
    }

}

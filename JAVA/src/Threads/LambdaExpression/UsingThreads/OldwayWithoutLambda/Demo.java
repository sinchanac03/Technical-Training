package Threads.LambdaExpression.UsingThreads.OldwayWithoutLambda;

public class Demo
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Mytask2 is running");
            }
        });
        t1.start();

    }
}

package OOPS.ConstructorDemo;

//program to show usage of default constructor
public class Demo
{
    Demo()
    {
        System.out.println("I am a constructor");
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Demo obj1=new Demo();
        Demo obj2=new Demo();
    }
}

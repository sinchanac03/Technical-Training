package OOPS.Polymorphism.CompileTime;

//2 same functions in same class-overloading
public class Addition
{
    int add(int a,int b)
    {
        return a+b;
    }
    //change return type
    float add(float a,float b)
    {
        return a+b;
    }
    //change number of parameters
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
class Driver
{
    static void main() {
        Addition obj=new Addition();
        obj.add(1,2);
        obj.add(2.0f,5.0f);
        obj.add(1,6,7);
    }
}

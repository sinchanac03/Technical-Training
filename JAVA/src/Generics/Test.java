package Generics;

//generics with single type input
 class Test <T>
{
    T obj;
    Test(T obj) //constructor
    {
        this.obj=obj;
    }
    void display()
    {
        System.out.println(obj);
    }

}
class Driver
{
    public static void main(String[] args)
    {
        Test<Integer> obj1=new Test<>(10);
        Test<String> obj2=new Test<>("Hello");
        obj1.display();
        obj2.display();
    }
}

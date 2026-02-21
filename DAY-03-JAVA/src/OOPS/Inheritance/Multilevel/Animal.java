package OOPS.Inheritance.Multilevel;

public class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Lion extends Animal
{
    void roar()
    {
        System.out.println("roaring");
    }

}
class BabyLion extends Lion
{
    void cry()
    {
        System.out.println("crying");
    }
}

class Driver1
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Lion l = new Lion();
        l.roar();
        l.eat();
        BabyLion b = new BabyLion();
        b.cry();
        b.roar();
        b.eat();
    }
}

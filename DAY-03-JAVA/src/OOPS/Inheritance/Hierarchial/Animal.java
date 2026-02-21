package OOPS.Inheritance.Hierarchial;


public class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
class Lion extends Animal
{
    void roarLion()
    {
        System.out.println("roaring lion");
    }

}
class Tiger extends Animal
{
    void roarTiger()
    {
        System.out.println("roaring tiger");
    }
}

class Driver2
{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Lion l = new Lion();
        l.roarLion();
        l.eat();
        Tiger b = new Tiger();
        b.roarTiger();

        b.eat();
    }
}


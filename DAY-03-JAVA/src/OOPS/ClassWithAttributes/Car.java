package OOPS.ClassWithAttributes;

public class Car
{
    String BrandName;
    int ManuDate;
    String Color;
    Car(String BrandName,int ManuDate,String Color )
    {
        this.BrandName=BrandName;
        this.ManuDate=ManuDate;
        this.Color=Color;

    }
    void printDetails()
    {
        System.out.printf("Car BrandName is %s\n", BrandName);
        System.out.printf("Car ManuDate is %d\n", ManuDate);
        System.out.printf("Car color is %s\n\n", Color);
    }
}
class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", 2000, "Red");
        Car c2 = new Car("BMW", 2002, "Green");
        c1.printDetails();
        c2.printDetails();

    }
}
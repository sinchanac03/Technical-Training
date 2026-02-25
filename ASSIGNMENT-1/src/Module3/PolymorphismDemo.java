package Module3;


class Shape
{
    void area()
    {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    void area()
    {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape
{
    double length, width;

    Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    void area()
    {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}

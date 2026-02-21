package OOPS.ConstructorDemo;

//also a example for constructor overloading
class Student
{
    String name;
    int usn;
    //normal constructor
    Student(String name,int usn)
    {
        this.name=name;
        this.usn=usn;
    }
    //copy constructor
    Student(Student obj)
    {
        this.name=obj.name;
        this.usn=obj.usn;
    }
    void display()
    {
        System.out.println(name + " " + usn);
    }
}
class Driver1
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Sinchana", 123);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }

}

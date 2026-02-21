package OOPS.Inheritance.SuperKeyword;

public class Person
{
    String fname,lname;
    Person(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }

}
class Student extends Person {
    int usn;

    Student(String fname, String lname, int usn) {
        super(fname, lname); //calling parent constructor here
        this.usn = usn;
    }

    void display() {
        System.out.println("Person first name:"+fname);
        System.out.println("Person last name:"+lname);
        System.out.println("Usn:"+usn);
    }
}
class Driver
{
    public static void main(String[] args)
    {
        Student s1=new Student("Sinchana","C",123);
        s1.display();
    }
}
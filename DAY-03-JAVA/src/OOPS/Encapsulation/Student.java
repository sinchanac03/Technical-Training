package OOPS.Encapsulation;

public class Student
{
    //to make attributes not get modiefied - encapsulation
    private String name;
    private int usn;
    Student(String name,int usn)
    {
        this.name=name;
        this.usn=usn;
    }
    //use of getters
    String getName(){
        return this.name;
    }
    //use of setters
    void setName(String name)
    {
        this.name=name;

    }
    int getUsn()
    {
        return this.usn;
    }
    void setUsn(int usn)
    {
        this.usn=usn;
    }
 void printDetails()
 {
     System.out.println("student name is: "+this.name);
     System.out.println("usn is: "+this.usn);
 }
}
class Driver
{
    public static void main(String[] args)
    {
        Student s1=new Student("Sinchana",123);
        s1.printDetails();
        //to print getter
        System.out.println("name is: "+s1.getName());
        //to print setters
        s1.setName("Sinch");
        s1.printDetails();

    }
}
package Module1;

import java.util.Scanner;
public class StudentMarks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks=sc.nextInt();
        if(marks<0 || marks>100)
        {
            System.out.println("Invalid marks! Please enter between 0 and 100");
        }
        else
        {
            int grade=marks/10;
            switch(grade)
            {
                case 10:
                case 9:
                    System.out.println("Grade:A");
                    break;
                case 8:
                case 7:
                    System.out.println("Grade:B");
                    break;
                case 6:
                    System.out.println("Grade:C");
                    break;
                case 5:
                case 4:
                    System.out.println("Grade:D");
                    break;
                default:
                    System.out.println("Grade:F");
            }
        }

    }
}

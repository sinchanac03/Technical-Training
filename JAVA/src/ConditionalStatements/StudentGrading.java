package ConditionalStatements;



import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sub1 Marks: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Sub2 Marks: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter Sub3 Marks: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter Sub4 Marks: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter Sub5 Marks: ");
        int sub5 = sc.nextInt();

        int total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total_marks/500.0) * 100;

        System.out.println("Total Marks" + total_marks);
        System.out.println("Percentage " + percentage);


        if( percentage >=75){
            System.out.println("A");
        }
        else if( percentage >=50){
            System.out.println("B");
        }
        else if( percentage >=30){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }
}

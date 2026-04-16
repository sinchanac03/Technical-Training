package Arrays.Basics;

public class ArrayDeclaration
{
    public static void main(String[] args)
    {
        int[] arr1; //initialization of array
        int[] arr2={1,2,3,4,5,6,7,8,9,10}; //declaraion of array - when we know elements
        int[] arr3=new int[5]; //when we only know size
        System.out.println(arr2[4]); //printing using array referencing
        for(int i=0;i<arr2.length;i++) //using for
        {
            System.out.println(arr2[i]); //print whole array
        }

    }
}

package Arrays.Basics;

public class MissingNumber
{
    public static void main(String[] args)
    {
        int[] arr={1,2,4,5};
        int n=5;
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<arr.length;i++)
        {
            actualsum+=arr[i];
        }
        System.out.println("Missing number is: " + (totalsum-actualsum));
    }
}

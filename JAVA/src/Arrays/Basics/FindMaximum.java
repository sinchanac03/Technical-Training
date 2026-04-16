package Arrays.Basics;

public class FindMaximum
{
    public static void main(String[] args)
    {
        int[] arr={5,12,7,6,90};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum= " + max);
    }
}

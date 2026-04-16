package Arrays.Searching;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={10,2,7,1,18,30,11,36};
        int search=11;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element " + search + " found at index " + i);
            }
        }
    }
}

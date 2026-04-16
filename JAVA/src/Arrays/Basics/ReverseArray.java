package Arrays.Basics;

//reversing using two pointer variable
public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int start=0, end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i] + " ");
        }
    }
}

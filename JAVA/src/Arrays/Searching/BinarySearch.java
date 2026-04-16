package Arrays.Searching;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        int start=0,search=7;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==search)
            {
                System.out.println(search + arr[mid]);
            } else if (arr[mid]<search)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        System.out.println();
    }
}

package RecursionAndBackTracking.BackTracking;

import java.util.*;

public class Permutations {

    static void permute(int[] arr, int index)
    {
        if(index == arr.length)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            permute(arr,index+1);

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        permute(arr,0);
    }
}
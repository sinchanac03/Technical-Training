package Arrays.Basics;

public class PartitionEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//program to put all the even numbers to right and odd numbers to the left of the array
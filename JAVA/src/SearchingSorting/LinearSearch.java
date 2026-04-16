package SearchingSorting;

public class LinearSearch
{

        static int LinearSearch(int key, int[] arr){
            for(int i=0; i<arr.length; i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {10,20,30,40,50};
            int key = 30;

            int result = LinearSearch(key, arr);
            if(result != -1){
                System.out.println("Element Found at index: " + result);
            }else{
                System.out.println("Element was not found!");
            }
        }
    }

/*
Time Complexity:
Best  -> O(1)
Worst -> O(n)
 */


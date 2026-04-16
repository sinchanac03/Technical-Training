package Arrays.MajorityElements;



public class Optimized {
    public static void main(String[] args) {
        int[] arr = {2,1,1,2,3,3};
        int candidate = arr[0];
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate = arr[i];
                count = 1;
            }
        }
        // candidate verification
        count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if(count > arr.length/2){
            System.out.println("MajorityElement " + candidate);
        }else{
            System.out.println("No majority elements");
        }
    }
}
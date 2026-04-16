package Arrays.Basics;


public class DifferenceArray {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];

        int L = 1;
        int R = 3;
        int val = 5;

        // create a diff array
        diff[L] += val;
        if(R+1 < n){
            diff[R+1] -= val;
        }

        // take out the prefix sum
        for(int i=1; i<n; i++){
            diff[i] = diff[i] + diff[i-1];
        }

        System.out.println("Result");

        for(int i=0; i<n; i++){
            System.out.print(diff[i] + " ");
        }

    }
}


package RecursionAndBackTracking.Recursion;
// Recursive Way
public class SumOfNatural {
    static int sum(int x){
        // base case
        if(x==1){
            return 1;
        }else{
            return x + sum(x-1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }
}

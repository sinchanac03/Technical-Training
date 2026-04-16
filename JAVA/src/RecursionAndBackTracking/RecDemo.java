package RecursionAndBackTracking;

public class RecDemo {
    static void function(){
        System.out.print("Hello ");
        function();
    }

    public static void main(String[] args) {
        function();
    }
}
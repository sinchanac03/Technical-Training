package Methods;

public class Example2 {
    static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        String result = String.format("Sum is %d", add(10,20));
        System.out.println(result);
    }
}
package Generics;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add("Hello");
        list.add(10);
//        list.add(1.5);

        int x =list.get(0);
        System.out.println(x);

    }
}
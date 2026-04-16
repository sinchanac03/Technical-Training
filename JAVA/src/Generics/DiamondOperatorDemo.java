package Generics;

import java.util.ArrayList;

public class DiamondOperatorDemo
{


        public static void main(String[] args)
        {
            ArrayList<Integer> list = new ArrayList<>(); //integer type arraylist
            list.add(20);
            list.add(10);
            list.add(15);
            System.out.println("Elements in the list: " + list);
            System.out.println("Element in second index: " + list.get(2));
        }
    }
    /* <> --> this is a diamond operator
    which mentions the particular datatype to be used
    in the arraylist
     */

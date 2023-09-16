//to swap the values of string without using third variable

import java.util.*;

public class solution4 {
    public static void swap_str(String a, String b){

        System.out.println("value of a before swapping:"+" " +a);
        System.out.println("value of b before swapping:"+ " "+b);
        a= a+b;
        b=a.substring(0,a.length() - b.length());
        a=a.substring(b.length());

        System.out.println("value of a after swapping:" + " "+ a);
        System.out.println("value of b after swapping:"+ " "+b);


    }

    public static void main(String[] args) {
        String a="Hello";
        String b="World";

        swap_str(a, b);


    }
}

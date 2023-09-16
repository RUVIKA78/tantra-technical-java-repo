//to swap two numbers without using a temporaray variables
import java.util.*;

public class solution5 {

    public static void swap_num(int a, int b){

        System.out.println("value of a before swapping:"+" " +a);
        System.out.println("value of b before swapping:"+ " "+b);
        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("value of a after swapping:" + " "+ a);
        System.out.println("value of b after swapping:"+ " "+b);



    }
    public static void main(String[] args) {
        int a=10;
        int b=50;

        swap_num(a, b);
        
    }
    
}

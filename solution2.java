//to checck whether a given string is a palindrome or not

import java.util.*;

public class solution2{

    public static boolean Ispalindrome(String str){


for(int i=0; i<str.length()/2;i++){
    int n=str.length();
    if(str.charAt(i)!=str.charAt(n-1-i)){
        return false;
    }
   
    
}
return true;
        
    }
    public static void main(String[] args) {
        String str1="anna";
        String str2="India";

        System.out.println(Ispalindrome(str1));
        System.out.println(Ispalindrome(str2));
    }
}
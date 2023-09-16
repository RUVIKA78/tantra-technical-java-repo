// to write a program to count the occurences of a character given in a string

import java.util.*;

class solution1 {
    public static int count_char(String str, char key) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == key) {
                count++;
            }
        }        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        char key1 = 'e';
        String str2 = "abccdefgaa";
        char key2 = 'c';
        count_char(str1, key1);
        count_char(str2, key2);
    }
}
package string;

import java.sql.Array;

public class ReverseString {
    public static void reverseString(String word){
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = word.toCharArray();
        for(int i = word.length() - 1; i >= 0 ;i--){
            stringBuilder.append(array[i]);
        }

        System.out.println("String before reverse : " + word);
        System.out.print("String after reverse : " + stringBuilder);
    }
}

package string;

public class Palindrome {

    public static void checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        System.out.println("String length : "+length+" divided by 2 : "+length/2);

        //level
        //i = 0   0('l') ==  (5-0-1) 4('l')
        //i = 1   1('e') ==  (5-1-1) 3('e')

        //i = 2   2('l') ==  (5-2-1) 2('l')
        //i = 3   3('e') ==  (5-3-1) 1('e')
        //i = 4   4('l') ==  (5-4-1) 0('l')

        //lovel
        //i = 0   0('l') ==  (5-0-1) 4('l')
        //i = 1   1('o') ==  (5-1-1) 3('e')

        if(result){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    public static void checkIntegerPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        System.out.println("Number : "+number);
        while(palindrome != 0){
            int remainder = palindrome % 10;
            System.out.println("Remainder : "+remainder);

            reverse = reverse * 10 + remainder;
            System.out.println("Reverse : "+reverse);

            palindrome = palindrome / 10;
            System.out.println("palindrome : "+palindrome);
            System.out.println();
        }

        if (number == reverse) {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}

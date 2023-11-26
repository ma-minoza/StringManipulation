import integer.Fibonacci;
import integer.PrimeNumber;
import integer.Sort;
import integer.SwapTwoNumber;
import string.CheckVowel;
import string.Palindrome;
import string.ReverseString;
import string.Whitespace;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        //ReverseString.reverseString(scanner.next());
        //SwapTwoNumber.swapTwoNumbers(67, 3);
        //CheckVowel.checkVowel("Tst");
        //PrimeNumber.primeNumber(11);
        //Fibonacci.recursiveFibonacci(10);
        //Palindrome.checkPalindromeString("lovel");
        //Palindrome.checkIntegerPalindrome(12321);
        //Whitespace.removeWhitespace("Test space");

        int[] array = {5, 2, 3, 4, 1};
        Sort.bubbleSort(array);

        /*String s = "  abc  def\t";
        s = s.strip();
        System.out.println(s);*/
    }
}
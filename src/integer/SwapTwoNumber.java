package integer;

public class SwapTwoNumber {
    //swap two numbers without using a third variable
    public static void swapTwoNumbers(int num1, int num2){

        System.out.println("Number 1 : "+num1);//1
        System.out.println("Number 2 : "+num2);//2

        System.out.println("After swap");

        num2 = num2 + num1;//3
        num1 = num2 - num1;//2
        num2 = num2 - num1;//1

        System.out.println("Number 1 : "+num1);//1
        System.out.println("Number 2 : "+num2);//2
    }

}

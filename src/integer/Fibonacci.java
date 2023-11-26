package integer;

public class Fibonacci {
    public static void fibonacci(int count){
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 1; i <= count;i++){
            if(i == count){
                System.out.print(a);
            }
            else{
                System.out.print(a +", ");
            }
            a = b;
            b = c;
            c = a +b;
            //1 a=0 b=1 c=1 -> a=1 b=1 c=2
            //2 a=1 b=1 c=2 -> a=1 b=2 c=3
            //3 a=1 b=2 c=3 -> a=2 b=3 c=5
            //4 a=2 b=3 c=5 -> a=3 b=5 c=8
            //5 a=3 b=5 c=8 -> a=5 b=8 c=13
        }
    }

    public static void recursiveFibonacci(int count){

        System.out.print("A Fibonacci sequence of " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciV2(i) + " ");
        }
    }

    public static int fibonacciV2(int count){
        if (count <= 1)
            return count;

        return fibonacciV2(count - 1) + fibonacciV2(count - 2);
    }
}

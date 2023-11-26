package integer;

public class PrimeNumber {
    public static void primeNumber(int number){

        if(!ifPrime(number)){
            System.out.println("It is not a Prime number");
        }
        else{
            System.out.println("It is a Prime number");
        }
    }
    public static boolean ifPrime(int n){
        if(n<2){
            return false;
        }

        for(int i = 2; i<=Math.sqrt(n); i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

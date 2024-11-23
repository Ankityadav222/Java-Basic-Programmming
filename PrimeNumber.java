public class PrimeNumber {
    public static boolean isPrime(int number){
        if(number <= 1) return false;
        if(number <= 2)  return true;



        for( int  i  = 2; i < Math.sqrt(number); i++ ){
          if(number % 1 == 0){
            return false;
          }

          return true;
        }
        return true;
           


           }
           public static void main(String[] args){
            int number =  2;


            if(isPrime(number)){
                System.out.println("Given Number is prime :" + number);
            } else{
                System.out.println("Given Number is not prime " + number);
            }
    }
}

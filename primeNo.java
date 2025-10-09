public class primeNo {
    public static void main(String [] args){
        int count = 0;
        for(int i=2 ; i<=100 ;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count + "total primes");
    }

    public static boolean isPrime(int n){
        for(int j = 2 ; j<=Math.sqrt(n) ; j++){
            if( n % j ==0){
                return false;
            }
        }
        return true;
    }
}

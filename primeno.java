public class primeno {
    public static void main(String[] args) {
        int count =0;
        for(int i=2; i<=100; i++){
            boolean isprime = true;

            for(int j=2 ; j<=Math.sqrt(i) ; j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }
            
            if(isprime == true){
                System.out.println(i + " ");
                count++;
            }
            
            
        }
        System.out.println("count = "+ count);
    }
}

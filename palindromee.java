public class palindromee {
    public static void main(String[] args){
        // number palindrome
        int num = 123521;
        boolean result = pal(num);

        
        if(result == true){
            System.out.println("------------------------");
            System.out.println(num + " is a palindrome ");
            System.out.println("------------------------");
        }else{
            System.out.println("------------------------");
            System.out.println(num + " is not a palindrome ");
            System.out.println("------------------------");
        }  
        
        // स्ट्रिंग palindrome
        String str = "leval";
        boolean res = pall(str);
        System.out.println("is a palindrome : " + res);

    }

    // for string
    public static boolean pall(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if( str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    //for integer
    public static boolean pal(int num){
        int originalnum = num;
        int rev = 0;
         
        while (num != 0){
            int digit = num%10;
            rev = rev*10 + digit;
            num /= 10;
        }
        
        return originalnum == rev;
    }
}

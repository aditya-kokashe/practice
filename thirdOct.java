
// import java.util.*;

public class thirdOct{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] marks = new int[n];
        // System.out.println("enter the marks according to rollnumber : ");
        // for(int i=0; i<n;i++){
        //     marks[i] = sc.nextInt();
        // }
        // sc.close();
        // for(int i=0;i<n;i++){
            //     if(marks[i] < 35){
                //         System.out.println("less than 35 : " + i + " rollnumber");
                //     }
                // }
                
        // System.out.print("enter length of array : ");
        // int n = sc.nextInt();
        
        // System.out.println("enter elements : ");
        // int[] arr = new int[n];
        // for(int i=0; i<n ; i++ ){
        //     //taking input
        //     arr[i] = sc.nextInt();
        // }
        // sc.close();

        // //sum of all elements
        // int sum = arr[0];
        // for(int i=1 ; i<n ; i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println("the sum of all the elements : " + sum);


        //MAX value in an array
        // int[] arr = {20,50,4,12,68,5,30,22};
        // int max = arr[0];
        // for(int i=1 ; i<arr.length ; i++){
        //     if(max < arr[i]){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //Second largest element
        int [] arr = {20,22,10,45,2,6,3,54,7,52,50};
        int max = arr[0];
        int secondmax = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max : " + max);
        for (int i=1 ; i<arr.length ; i++){
            if (secondmax < arr[i] && arr[i] != max){
                secondmax = arr[i];
            }
            
        }
        System.out.println("second max : " + secondmax);
    }
}
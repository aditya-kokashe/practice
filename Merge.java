public class Merge{
    public static void main(String [] args){
        int[] arr = {7,8,5,4,5,6,9,3,1};
        mergeSort(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    
    public static void mergeSort(int[] arr){
        int len = arr.length;
        if(len <=1 ) return;
        
        int mid = len/2;
        
        int[] left = new int[mid];
        int right[] = new int[len - mid];
        
        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }
        for(int i=mid; i<len; i++){
            right[i - mid] = arr[i];    
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }
    
    public static void merge(int[]left, int[] right, int[]arr){
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i< left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];   
            }
            
        }
        
        while(i< left.length){
            arr[k++] = left[i++];
        }
        
        while(j < right.length){
            arr[k++] = right[j++];
        }
        
    }
}
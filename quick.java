public class quick {

	public static void main(String[] args) {
		int[] arr = {4,7,8,5,6,3,2,1,9};
		quick(arr, 0 , arr.length-1);
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static void quick(int[] arr, int start, int end) {
		if(end <= start) return;	//base case
		
		int pivot = partition(arr, start, end);
		quick(arr, start, pivot-1);
		quick(arr, pivot+1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start -1;
		for(int j = start ; j<=end-1; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		
		return i;
	}

	
	
}

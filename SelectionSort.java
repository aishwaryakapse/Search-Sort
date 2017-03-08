package searchsort;

public class SelectionSort {
	void sort(int[] arr){
		int n = arr.length;
		for(int i =0; i<n-1; i++){
		
			int min_index = i;
			
			for(int j= i+1; j < n; j++){
				if(arr[j] < arr[min_index]){
					min_index = j;
				}
			}
			
			//found the min index. Now swap the min index element with the 1st element
			
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
				
		}
	}
	
	void printArray(int[] arr){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = {65,22,11,45,9};
		System.out.println("Original Array");
		ss.printArray(arr);
		ss.sort(arr);
		System.out.println("Sorted Array");
		ss.printArray(arr);
	}

}

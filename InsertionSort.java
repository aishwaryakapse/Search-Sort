package searchsort;

public class InsertionSort {
	
	void insertionSort(int[] arr){
		int n = arr.length;
		for(int i=1; i< n-1; i++){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
	
	void printArray(int[] arr){
		for(int i = 0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		InsertionSort is = new InsertionSort();
		int[] arr = {31, 24, 53, 24, 32};
		System.out.println("Original Array");
		is.printArray(arr);
		is.insertionSort(arr);
		System.out.println("Sorted Array: ");
		is.printArray(arr);

	}

}

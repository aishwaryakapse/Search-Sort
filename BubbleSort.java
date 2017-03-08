package searchsort;

public class BubbleSort {
	
	void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	void bubbleSortOptimized(int[] arr){
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0; i < n-1; i++){
			swapped = false;
			for(int j = 0; j < n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false){
				break;
			}
		}
	}
	
	
	void printArray(int[] arr){
		for(int i =0; i< arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] arr1 = {64, 22, 34, 12, 11};
		System.out.println("Original array: ");
		bs.printArray(arr1);
		bs.bubbleSort(arr1);
		System.out.println("Sorted Array: ");
		bs.printArray(arr1);
		
		int[] arr2 = {34, 12, 27, 17, 31};
		System.out.println("Original array: ");
		bs.printArray(arr2);
		bs.bubbleSortOptimized(arr2);
		System.out.println("Sorted Array: ");
		bs.printArray(arr2);
	}
}

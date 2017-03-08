package searchsort;

public class BinarySearch {
	
	int binarySearchRecur(int arr[], int l, int r, int x){
		if(r >= l){
			int mid = l + (r-l)/2;
			
			if(arr[mid] == x)
				return mid;
			
			if(arr[mid] > x)
				return binarySearchRecur(arr, l, mid-1, x);
			else
				return binarySearchRecur(arr, mid+1, r, x);
		}
		
		return -1;
	}
	
	int binarySearchIter(int arr[], int x){
		int l = 0, r = arr.length-1;
		while(l <= r){
			int m = l+(r-l)/2;
			
			if(arr[m] == x)
				return m;
			
			if(arr[m] > x)
				r = m-1;
			else
				l = m+1;
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = {1, 3, 5, 7, 9};
		int x = 7;
		int n = arr.length;
		
		System.out.println("Recursive: "+bs.binarySearchRecur(arr, 0, n-1, x));
		int[] arr2 = {1, 3, 5, 7, 9};
		System.out.println("Iterative: "+bs.binarySearchIter(arr2, x));

	}

}

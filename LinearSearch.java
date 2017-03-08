package searchsort;

public class LinearSearch {

	public int search(int arr[], int x){
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		int[] arr = {1,3, 5, 7, 9};
		int x = 7;
		System.out.println(ls.search(arr, x));

	}

}

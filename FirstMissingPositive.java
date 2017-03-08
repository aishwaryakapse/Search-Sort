/* using bucket sort here*/
package searchsort;

public class FirstMissingPositive {
	public int firstMissingPositiveand0(int[] arr){
		int n = arr.length;
		
		for(int i=0; i<n; i++){
			//When the ith element is not i
			while(arr[i] != i){
				//no need to swap when ith element is out of range [0,n]
				if(arr[i] < 0 || arr[i] >= n){
					break;
				}
				
				//handling duplicates
				if(arr[i] == arr[arr[i]])
					break;
				
				//swap elements
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
		}
		
		for(int i=0; i<n; i++){
			if(arr[i] != i)
				return i;
		}
		
		return n;
	}
	
	public int firstMissingPositive(int[] arr){
		int n = arr.length;
		for(int i=0; i< n; i++){
			while(arr[i] != i+1){
				if(arr[i] <=0 || arr[i] >= n){
					break;
				}
				
				if(arr[i] == arr[arr[i]-1])
					break;
				
				//swap else
				int temp = arr[i];
				arr[i] = arr[temp-1];
				arr[temp-1] = temp;
			}
		}
		
		for(int i=0; i<n; i++){
			if(arr[i] != i+1){
				return i+1;
			}
		}
		return n;
	}
	
	
	public static void main(String[] args) {
		FirstMissingPositive fmp = new FirstMissingPositive();
		int[] arr ={0,2,1,3};
		int[] arr1 ={1,2,1,3};
		System.out.println(fmp.firstMissingPositiveand0(arr));
		System.out.println(fmp.firstMissingPositive(arr1));
	}

}

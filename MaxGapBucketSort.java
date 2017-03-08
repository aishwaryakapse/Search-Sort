//return 0 if num==null or num.length == 0
package searchsort;

public class MaxGapBucketSort {
	public int maximumGap(int[] num){
		if(num == null)
			return 0;
		
		if(num.length < 2)
			return 0;
		
		//find the max and min in the array
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i< num.length; i++){
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}
		
		//initialize the array of buckets [0 to n]
		Bucket[] buckets = new Bucket[num.length +1];
		for(int i=0; i<buckets.length; i++){
			buckets[i] = new Bucket();
		}
		
		double interval = (double)(num.length/(max - min));
		
		//distribute every number to a bucket array
		for(int i=0; i<num.length; i++){
			int index = (int)((num[i] - min)*interval);
			
			if(buckets[index].low == -1){
				buckets[index].low = num[i];
				buckets[index].high = num[i];
			}else{
				buckets[index].low = Math.min(buckets[index].low, num[i]);
				buckets[index].high = Math.max(buckets[index].high, num[i]);
			}
		}
		
		//scan buckets to find maximum gap
		
		int result =0;
		int prev = buckets[0].high;
		for(int i=1; i<buckets.length; i++){
			if(buckets[i].low != -1){
				result = Math.max(result, buckets[i].low-prev);
				prev = buckets[i].high;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		MaxGapBucketSort mgbs = new MaxGapBucketSort();
		int[] num = {4,6,2,10};
		
		int res = mgbs.maximumGap(num);
		System.out.println(res);
		

	}

}

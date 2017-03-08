package searchsort;

import java.util.Arrays;

public class CountingSortColors {
	public void sortcolors(int[] nums) {
		if(nums == null || nums.length < 2) {
			return;
		}
		
		int[] count = new int[3];
		for(int i=0; i<nums.length; i++) {
			count[nums[i]]++;
		}
		
		int i=0;
		int k=0;
		while(i <= 2) {
			if(count[i] != 0) {
				nums[k++] = i;
				count[i] = count[i] - 1;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		CountingSortColors cs = new CountingSortColors();
		int[] nums = {1, 2, 0, 2, 2, 1, 2 ,1, 0, 0, 1, 2, 0};
		cs.sortcolors(nums);
		System.out.println(Arrays.toString(nums));
	}

}

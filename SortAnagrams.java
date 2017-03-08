package searchsort;

import java.util.*;

public class SortAnagrams {
	public String sortchars(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public void sort(String[] array) {
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		
		//Group words by anagram
		for(String s : array) {
			String key = sortchars(s);
			if(!hash.containsKey(key)) {
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hash.get(key);
			anagrams.push(s);
		}
		
		/*Convert Hashtable to array */
		int index = 0;
		for(String key : hash.keySet()) {
			LinkedList<String> list = hash.get(key);
			for(String t : list) {
				array[index] = t;
				index++;
			}
		}
	}
	
	public static void main(String[] args) {
		String[] array = {"waterloo", "loowater", "bbcnews", "newsbbc", "boba"};
		SortAnagrams sa = new SortAnagrams();
		sa.sort(array);
		System.out.println(Arrays.toString(array));
	}

}

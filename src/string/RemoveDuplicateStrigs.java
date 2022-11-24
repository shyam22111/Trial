package string;

import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class RemoveDuplicateStrigs {

	public static void main(String[] args) {
		String s = "i love india and you love india";
		String[] arr = s.split(" ");
		 HashedMap<String, Integer> hm = new HashedMap<>();
		 
		 for(String word:arr) {
			 if(hm.containsKey(word)) {
				 
				 hm.put(word,(hm.get(word)+1));
			 }
			 
			 else {
				hm.put(word, 1);
			}
		 }
		Set<Entry<String, Integer>> es = hm.entrySet();
		for(Entry<String, Integer> st:es) {
			System.out.println(st);
		}
		 
		 
	}

}

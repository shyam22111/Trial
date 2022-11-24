package string;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicate {
	
	public static void main(String[] args) {
		String string = "1234567890poiuytrewqasdfdgfhfjgkl,j.nmbx ////vxcdzxeqretdh fgru477 85q68975nvy8v47";
		char[] str = string.toCharArray();
		HashMap<Character, Integer> HS = new HashMap<>();
		
		for(Character word:str) {
			if(HS.containsKey(word)) {
				HS.put(word, HS.get(word)+1);
			} else {
				HS.put(word, 1);
			}	
			
		}  
		
		// read data from HS
		Set<Entry<Character, Integer>> Eset = HS.entrySet();
		for(Entry<Character, Integer> entryValue: Eset) {
			if(entryValue.getValue()>1) {
				System.out.println(entryValue.getKey()+ ": repeated =" +entryValue.getValue());
			}
		}
	}  

}

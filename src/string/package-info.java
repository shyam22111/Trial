package string;
//
//
//
//import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class DuplicateChar1 {
//
//	public static void main(String[] args) {
//		
//		string("testoftest");
//
//	}
//
//	public static void string(String str) {
//		
//		char[] word = str.toCharArray();
//		
//		HashMap<Character, Integer>  HM = new HashMap<>();
//		
//		
//		for(Character ch : word) {
//			if(HM.containsKey(ch)) {
//				HM.put(ch, HM.get(ch)+1);
//			}
//			else { HM.put(ch, 1);
//				
//			}
//			
//			
//		}
//		
//		// print duplicate
//		Set<Entry<Character, Integer>> entryset = HM.entrySet();
//	    for(Entry<Character, Integer> entry: entryset) {
//	    	if(entry.getValue()>1) {
//	    		System.out.println(entry.getKey()+": repeated "+entry.getValue()+" times");
//	    	}
//	    	
//	    }
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//}
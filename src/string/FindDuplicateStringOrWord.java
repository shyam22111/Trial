package string;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FindDuplicateStringOrWord {

	public static void main(String[] args) {                                      

          String s  = "java language and python language and c language";
          
           String[] arr= s.split(" ");
         
         HashMap<String,Integer> mp = new HashMap<>();
        
       for(String word:arr) {
  
    	   if(mp.containsKey(word)) {
    		   mp.put(word,mp.get(word)+1);
    	   }
    	   else{
    		   mp.put(word, 1);
    	   }
    	   
       } 
       
        
          Set<Entry<String, Integer>> val = mp.entrySet();
          for(Entry<String, Integer> en:val) {
        	  System.out.println(en);
          }
       
	}

}
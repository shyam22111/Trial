package string;

import java.util.Arrays;

public class AnaGram {

//	public static void main(String[] args) {
//		String s = "Table";
//		String s1="Batle";
//		
//		s.toLowerCase();
//		s1.toLowerCase();
//		
//		System.out.println(s);
//		
//		char[] ar1 = s.toCharArray();
//		char[] ar2 = s1.toCharArray();
//		
//	    Arrays.sort(ar1);
//		Arrays.sort(ar2);
//		
//		Arrays.toString(ar1);
//		Arrays.toString(ar2);
//		System.out.println(Arrays.toString(ar1));
//		System.out.println(Arrays.toString(ar2));
//		
//		System.out.println();
//		if(ar1.equals(ar2)) {
//			System.out.println("String "+s+" and "+s1+" are Anagram String");
//		}
//		
//		else {
//			System.out.println("String "+s+" and "+s1+" are not Anagram String");
//		}
//	}
	
	public static void main(String args[]) {
	      String str1 = "Race";
	      String str2 = "Care";
	      
	     String a = str1.toLowerCase();
	     String b = str2.toLowerCase();
	  

	      if (a.length()==b.length()) {
	         char[] arr1 = a.toCharArray();
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         char[] arr2 = b.toCharArray();
	         Arrays.sort(arr2);
	         System.out.println(Arrays.toString(arr2));
	         
	        boolean result = Arrays.equals(arr1, arr2);
	        System.out.println(result);
	        
	         if(result) {
	            System.out.println("Given strings are anagrams");
	         } else {
	            System.out.println("Given strings are not anagrams");
	         }
	      }
	   } 

}

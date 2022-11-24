package string;

public class AddVluesFromString {
	public static void main(String[] args) {
	      String S= "e3t68h5cu066";
	      String S1="";
	      
	      for(int i= 0;i<S.length();i++) {
	    	  if(Character.isDigit(S.charAt(i))) {
	    		  S1=S1+S.charAt(i);
	    		  
	    	  }
	    	  
	      }   System.out.println(S1);
	          sumIntString();
	}      
	
	
	
	
	public static void sumIntString() {
	      String S= "e3t68h5cu066";
	      String S1="";
	      int sum=0;
	      
	      for(int i= 0;i<S.length();i++) {
	    	  if(Character.isDigit(S.charAt(i))) {
	    		  S1=S.substring(i, i+1);
	    		  sum=sum+Integer.parseInt(S1);
	    	  }
	    	  
	      }  System.out.println(sum);
		
		
		
	}
	
	
	
	

}
